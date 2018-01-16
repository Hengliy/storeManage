package dao;

import entity.OutgoodsEntity;
import entity.VIngoodsEntity;
import entity.VOutgoodsEntity;

import java.util.HashMap;
import java.util.List;

public interface OutGoodsDao {
    public List<VOutgoodsEntity> getAllVOutGoods();
    public Boolean insertOutGoods(OutgoodsEntity outgoodsEntity);
    public List<VOutgoodsEntity>  searchGoodsBy (HashMap<String,String> condition);
}
