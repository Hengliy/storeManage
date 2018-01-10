import dao.InGoodsDao;
import daoimpl.GoodsDaoImpl;
import daoimpl.InGoodsDaoImpl;
import entity.VIngoodsEntity;
import jdk.internal.org.objectweb.asm.tree.VarInsnNode;

import java.util.List;

public class daoTest {


    public static void main(String[] args) {
        GoodsDaoImpl a = new GoodsDaoImpl();
        InGoodsDao dao=new InGoodsDaoImpl();

        List<VIngoodsEntity> list= dao.getAllVInGoods();
        for(VIngoodsEntity vIngoodsEntity: list)
        {
            System.out.println(vIngoodsEntity);
            System.out.println("--------------");
        }
//        GoodsEntity u = new GoodsEntity();
//        u.setName("吴林峰");
//        u.setKindName("食物");
//       // u.setCount(100L);
//        u.setDiscount(new BigDecimal(0.12));
//        u.setInprice(new BigDecimal(1000.02));
//        u.setOutprice(new BigDecimal(1000.02));
//        u.setProductorName("赛诺有限公司");
//        u.setMinNum(123);
////
//        if( a.insertGoods(u)==true)//如果插入成功
//        {
//            System.out.println("successfully");
//        }
//        if(a.deleteGoods(10001)==true)//如果插入成功
//        {
//            System.out.println("successfully");
//        }

//        StaffDaoImpl a = new StaffDaoImpl();
//        StaffEntity b = new StaffEntity();
//        b.setUsername("吴林峰");
//        //b.setSex("");
//        b.setTel("0908");
//        b.setPassword("1209u88431");
//        a.insertStaff(b);


    }
}
