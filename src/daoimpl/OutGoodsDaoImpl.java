package daoimpl;

import dao.OutGoodsDao;
import entity.OutgoodsEntity;
import entity.VIngoodsEntity;
import entity.VOutgoodsEntity;
import hibernate.BaseDaoImpl;

import java.util.HashMap;
import java.util.List;

public class OutGoodsDaoImpl extends BaseDaoImpl implements OutGoodsDao {
    @Override
    public List<VOutgoodsEntity> getAllVOutGoods() {
        return (List<VOutgoodsEntity>) getAllData("voutgoods",VOutgoodsEntity.class);
    }

    @Override
    public Boolean insertOutGoods(OutgoodsEntity outgoodsEntity) {
        return insertByID(outgoodsEntity);
    }

    @Override
    public List<VOutgoodsEntity> searchGoodsBy(HashMap<String, String> condition) {
        return (List<VOutgoodsEntity>) searchByWhat(condition, VOutgoodsEntity.class);
    }
}
