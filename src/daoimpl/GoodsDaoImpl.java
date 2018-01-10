package daoimpl;

import dao.GoodsDao;
import entity.GoodsEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//商品的业务逻辑类
public class GoodsDaoImpl implements GoodsDao {
    private Session session = null;
    private Transaction transaction = null;
    private Configuration configuration = null;
    private SessionFactory sessionFactory = null;

    public GoodsDaoImpl() {
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
    @Override
    public List<GoodsEntity> getAllGoods()
    {
        List<GoodsEntity>  list=null;
        try{

            session =sessionFactory.openSession();
            transaction=session.beginTransaction();

            String hql="from GoodsEntity";
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

    @Override
    public Boolean insertGoods(GoodsEntity goodsEntity) {
        return null;
    }

    @Override
    public List<GoodsEntity> getGoodsBy(String name) {
        return null;
    }

    @Override
    public Boolean deleteGoods(int id) {
        return null;
    }

    @Override
    public List<GoodsEntity> searchGoodsBy(List<String> list) {
        return null;
    }

}
