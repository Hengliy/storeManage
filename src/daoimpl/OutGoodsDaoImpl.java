package daoimpl;

import dao.OutGoodsDao;
import entity.OutgoodsEntity;
import entity.VOutgoodsEntity;
import hibernate.BaseDaoImpl;

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
}
