package daoimpl;

import dao.GoodsDao;
import entity.GoodsEntity;
import hibernate.BaseDaoImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//商品的业务逻辑类
public class GoodsDaoImpl extends BaseDaoImpl implements GoodsDao {
    private Session session = null;
    private Transaction transaction = null;
    private Configuration configuration = null;
    private SessionFactory sessionFactory = null;

    public GoodsDaoImpl() {
    }

    /**
     * 查询Goods表所有数据
     */
    @Override
    public List<GoodsEntity> getAllGoods()
    {
/*        List<GoodsEntity> list=null;
        try{

            session =sessionFactory.openSession();
            transaction=session.beginTransaction();

            String hql="from GoodsEntity";
            list = session.createSQLQuery("{call goods()}").addEntity(GoodsEntity.class).list();

            transaction.commit();

        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return list;*/
        return (List<GoodsEntity>) getAllData("goods",GoodsEntity.class);
    }

    @Override
    public Boolean insertGoods(GoodsEntity goodsEntity) {
        return insertByID(goodsEntity);
    }

    @Override
    public List<GoodsEntity> getGoodsBy(String name) {
        return null;
    }

    @Override
    public Boolean deleteGoods(int id)
    {
        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setId(id);
        return deletByID(goodsEntity);
    }

    @Override
    public Boolean updateGoods(GoodsEntity entity) {

        return updateByID(entity);
    }

    @Override
    public List<GoodsEntity> searchGoodsBy(List<String> list) {
        return null;
    }


}
