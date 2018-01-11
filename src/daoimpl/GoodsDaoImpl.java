package daoimpl;

import dao.GoodsDao;
import entity.GoodsEntity;
import hibernate.BaseDaoImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;
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
    public List<GoodsEntity> getAllGoods() {
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
    public List<GoodsEntity> searchGoodsBy(HashMap<String, String> condition) {
        return (List<GoodsEntity>) searchByWhat(condition,GoodsEntity.class);
    }

    @Override
    public Boolean updateGoods(GoodsEntity entity) {

        return updateByID(entity);
    }


}
