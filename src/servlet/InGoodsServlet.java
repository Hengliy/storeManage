package servlet;

import dao.GoodsDao;
import dao.InGoodsDao;
import daoimpl.GoodsDaoImpl;
import daoimpl.InGoodsDaoImpl;
import entity.GoodsEntity;
import entity.IngoodsEntity;
import entity.VIngoodsEntity;
import jdk.internal.org.objectweb.asm.tree.VarInsnNode;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "InGoodsServlet",urlPatterns = "/servlet/InGoodsServlet")
public class InGoodsServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("***********init_servlet*********************");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("***********doPost ingoods_servlet*********************");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String method = request.getParameter("method");
        if("getall".equals(method))
        {
            List<VIngoodsEntity> allGoodsList= new ArrayList<VIngoodsEntity>();

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            InGoodsDaoImpl dao = new InGoodsDaoImpl();

            List<VIngoodsEntity> allVInGoodsList = dao.getAllVInGoods();

            request.getSession().invalidate();

            System.out.println(allVInGoodsList.get(0).getGoodsName());

            request.getSession().setAttribute("allVInGoodsList",allVInGoodsList);

            response.sendRedirect("/ingoods.jsp");//需要用重定向  这样地址栏不变
//        }
        }else if(method!=null&&method.equals("add"))
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(request.getParameter("name"));
//            System.out.println(request.getParameter("inprice"));

            IngoodsEntity ingoodsEntity=new IngoodsEntity();

            ingoodsEntity.setGoodsName(request.getParameter("name"));
            ingoodsEntity.setInprice(new BigDecimal(request.getParameter("inprice")));
            ingoodsEntity.setOldInprice(new BigDecimal(request.getParameter("inprice")));
            ingoodsEntity.setCount(Integer.parseInt(request.getParameter("count")));
            ingoodsEntity.setIndate(new Timestamp(System.currentTimeMillis()));
            ingoodsEntity.setStaffId((short) 1);
            System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}}{}{");

            InGoodsDao dao=new InGoodsDaoImpl();

            if(dao.insertIngoods(ingoodsEntity))//如果插入成功
            {
                System.out.println("successfully");
                response.sendRedirect("InGoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
            else
            {
                System.out.println("failure");
                response.sendRedirect("InGoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
        }else if(method.equals("search"))
        {
            System.out.println("Search Goods");

            //System.out.println(request.getParameter("start_time")+"   "+request.getParameter("start_time"));
            System.out.println(request.getParameter("words"));
            System.out.println(request.getParameter("kind")+"   "+request.getParameter("productor"));

            HashMap<String,String> map =new HashMap<String, String>() ;



            // map.put("name",request.getParameter("words"));
            if(!request.getParameter("kind").equals(""))   map.put("kind_name",request.getParameter("kind"));
            if(!request.getParameter("productor").equals("")) map.put("productor_name",request.getParameter("productor"));

            String date="";
            if(!request.getParameter("startdate").equals(""))
            {
                date+=request.getParameter("startdate");
                System.out.println(date);//map.put("productor_name",request.getParameter("productor"));
            }
            if(!request.getParameter("enddate").equals(""))
            {
                date+=";"+request.getParameter("enddate");
                map.put("indate",date);
                System.out.println(date);
            }
//            map.put("kind_name","食物");
//            map.put("productor_name","赛诺有限公司");

            InGoodsDao dao = new InGoodsDaoImpl();

            List<VIngoodsEntity> allVInGoodsList= dao.searchGoodsBy(map);

            if(!allVInGoodsList.isEmpty())
                for(VIngoodsEntity vIngoodsEntity:allVInGoodsList)
                {
                    System.out.println(vIngoodsEntity);
                }
            else{
                System.out.println("&& nothing searched &&");
            }
            request.getSession().invalidate();
            request.getSession().setAttribute("allVInGoodsList", allVInGoodsList);
            response.sendRedirect("/ingoods.jsp");//需要用重定向  这样地址栏不变
        }
    }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("***********doGet ingoods servlet*********************");
            PrintWriter out = response.getWriter();
            this.doPost(request, response);//调用doPost方法
            out.flush();
            out.close();
        }
}
