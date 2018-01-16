package daoimpl;

import dao.InGoodsDao;
import entity.IngoodsEntity;
import entity.VIngoodsEntity;
import hibernate.BaseDaoImpl;
import jdk.internal.org.objectweb.asm.tree.VarInsnNode;

import java.util.HashMap;
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

    @Override
    public List<VIngoodsEntity> searchGoodsBy(HashMap<String, String> condition) {
        return (List<VIngoodsEntity>) searchByWhat(condition, VIngoodsEntity.class);
    }
}
