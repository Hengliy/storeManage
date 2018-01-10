package dao;

import entity.GoodsEntity;

import java.util.List;

public interface GoodsDao {
    /*获取所有数据*/
    public List<GoodsEntity> getAllGoods();
    /*插入一条新数据*/
    public Boolean insertGoods(GoodsEntity goodsEntity);
    /*根据名字获取数据，模糊匹配*/
    public List<GoodsEntity> getGoodsBy(String name);
    /*根据id删除num个数库存 */
    public Boolean deleteGoods(int id);
    /*条件搜索（保留实现）*/
    public List<GoodsEntity>  searchGoodsBy(List<String> list);//[分类，厂家，开始时间，结束时间]
}
