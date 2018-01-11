package hibernate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.sql.Timestamp;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.query.NativeQuery;

public class BaseDaoImpl{
    protected Configuration configuration = null;
    protected SessionFactory sessionFactory = null;
    private Transaction transaction = null;

    private final int BATCH_NUMBER = 100;//批量操作数
    /**
     * 模板缓存
     */
    public BaseDaoImpl() {
        //实例化sessionFactory
        // SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.print("$$$$$$$$$$$$$$$$$$$");
    }

    public List<?> getAllData(String table,Class entity)
    {
        List<?> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            transaction=session.beginTransaction();

            list = session.createSQLQuery("{call "+table+"()}").addEntity(entity).list();

            transaction.commit();

        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return list;
    }

    public <T> boolean deletByID(T entity)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean flag = false;
        try{
            transaction=session.beginTransaction();
            session.delete(entity);
            transaction.commit();
            flag = true;
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            flag = false;
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return flag;
    }

    public <T> Boolean insertByID(T entity)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean flag = false;
        try{
            transaction=session.beginTransaction();
            session.save(entity);
            transaction.commit();
            flag = true;
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            flag = false;
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return flag;
    }

    public <T> boolean updateByID(T entity)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean flag = false;
        try{
            transaction=session.beginTransaction();
            session.update(entity);
            transaction.commit();
            flag = true;
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            flag = false;
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return flag;
    }

    public List<?> searchByWhat(HashMap<String,String> condition,Class entity)
    {
        List<?> list = null;
        Iterator iter = condition.entrySet().iterator();
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean flag = false;
        try{
            transaction=session.beginTransaction();
            Criteria criteria = session.createCriteria(entity);
            for (Entry<String, String> entry : condition.entrySet()) {
                String column  = entry.getKey();
                String value = entry.getValue();
                if(column.equals("name") || column.equals("goodsName") )
                {
                    criteria.add(Restrictions.like(column,value, MatchMode.ANYWHERE));
                }
                else if(column.equals("breakdate" )|| column.equals("outdate") || column.equals("indate"))
                {
                    String startTime = value.split(";")[0] + " 00:00:00";
                    System.out.println(startTime);
                    String endTime = value.split(";")[1] + " 23:59:59";
                    System.out.println(endTime);
                    criteria.add(Restrictions.between(column,Timestamp.valueOf(startTime), Timestamp.valueOf(endTime)));
                }
                else
                {
                    criteria.add(Restrictions.eq(column, value));
                }
            }
            list = criteria.list();
            transaction.commit();
            flag = true;
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
            flag = false;
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return list;
    }

    /**
     * 关闭session
     * */
    public void closeSession(Session session) {
        if (session != null) {
            try {
                session.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            session = null;
        }
    }


}
