package daoimpl;

import dao.InGoodsDao;
import entity.IngoodsEntity;
import entity.VIngoodsEntity;
import hibernate.BaseDaoImpl;

import java.util.List;

public class InGoodsDaoImpl extends BaseDaoImpl implements InGoodsDao {


    @Override
    public List<VIngoodsEntity> getAllVInGoods() {
        return (List<VIngoodsEntity>) getAllData("vingoods",VIngoodsEntity.class);
    }

    @Override
    public Boolean insertIngoods(IngoodsEntity ingoodsEntity) {
        return insertByID(ingoodsEntity);
    }
}
