package daoimpl;

import entity.IngoodsEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class InGoodsDaoImpl {

    private Session session = null;
    private Transaction transaction = null;
    private Configuration configuration = null;
    private SessionFactory sessionFactory = null;

    public InGoodsDaoImpl() {
        //实例化session
        //实例化Configuration，这行代码默认加载hibernate.cfg.xml文件
        System.out.print("################");
        configuration = new Configuration().configure();
        //以Configuration创建SessionFactory
        System.out.print("++++++++++++++++++");
        sessionFactory = configuration.buildSessionFactory();
        System.out.print("$$$$$$$$$$$$$$$$$$$");
    }
    /**
     * 查询Goods表所有数据
     */
    public List<IngoodsEntity> getAllInGoods()
    {
        List<IngoodsEntity>  list=null;
        try{

            session =sessionFactory.openSession();
            transaction=session.beginTransaction();

            String hql="from IngoodsEntity ";
            list = session.createQuery(hql).list();

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

    public List<IngoodsEntity> getInGoodsBy(List<String> condition) {
        return null;
    }
}
