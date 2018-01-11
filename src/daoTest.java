import dao.GoodsDao;
import dao.InGoodsDao;
import dao.OutGoodsDao;
import daoimpl.GoodsDaoImpl;
import daoimpl.InGoodsDaoImpl;
import daoimpl.OutGoodsDaoImpl;
import entity.GoodsEntity;
import entity.OutgoodsEntity;
import entity.VIngoodsEntity;
import hibernate.BaseDaoImpl;
import jdk.internal.org.objectweb.asm.tree.VarInsnNode;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class daoTest {

    public static void main(String[] args) {
        BaseDaoImpl dao = new BaseDaoImpl();

        HashMap<String,String> map =new HashMap<String, String>() ;

        map.put("name","小熊饼干");

        List<GoodsEntity> list= (List<GoodsEntity>) dao.searchByWhat(map,GoodsEntity.class);

        if(list!=null)
            for(GoodsEntity goodsEntity:list)
            {
                System.out.println(goodsEntity);
            }

    }
}
