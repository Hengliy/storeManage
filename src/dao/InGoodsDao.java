package dao;

import entity.GoodsEntity;
import entity.IngoodsEntity;
import entity.VIngoodsEntity;

import java.util.HashMap;
import java.util.List;

public interface InGoodsDao {
    /*获取所有进货视图数据*/
    public List<VIngoodsEntity> getAllVInGoods();
    /*插入一条新数据*/
    public Boolean insertIngoods(IngoodsEntity ingoodsEntity);

    public List<VIngoodsEntity>  searchGoodsBy (HashMap<String,String> condition);
}
