package dao;

import entity.OutgoodsEntity;
import entity.VOutgoodsEntity;

import java.util.List;

public interface OutGoodsDao {
    public List<VOutgoodsEntity> getAllVOutGoods();
    public Boolean insertOutGoods(OutgoodsEntity outgoodsEntity);
}
