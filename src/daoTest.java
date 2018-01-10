import dao.GoodsDao;
import daoimpl.GoodsDaoImpl;
import entity.GoodsEntity;
import org.hibernate.HibernateException;

import java.util.List;

public class daoTest {


    public static void main(String[] args) {
        GoodsDao dao =new GoodsDaoImpl();
        try{
            List<GoodsEntity> list=dao.getAllGoods();
            for(GoodsEntity entity:list)
            {
                System.out.println(entity);
            }
        }catch (HibernateException e)
        {
            e.printStackTrace();
        }
        System.out.println("++++++++++++++++++++++");
    }
}
