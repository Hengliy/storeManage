package servlet;

import dao.GoodsDao;
import daoimpl.GoodsDaoImpl;
import entity.GoodsEntity;
import hibernate.BaseDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet(name ="showAllGoodsServlet",urlPatterns = {"/servlet/GoodsServlet"}) //url要先写一个“/”表示路径
public class GoodsServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("***********init_servlet*********************");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("***********doPost_goodsServlet*********************");

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String method=request.getParameter("method");
        if(method!=null&&method.equals("getall")) {
            List<GoodsEntity> allGoodsList = new ArrayList<GoodsEntity>();

            System.out.println("getallxxxxxxxxxxxxxxxxxxxxxxxxx");

            GoodsDao dao = new GoodsDaoImpl();

            allGoodsList = dao.getAllGoods();

            request.getSession().setAttribute("allGoodsList", allGoodsList);

            //System.out.println(allGoodsList.get(0).getName());

            response.sendRedirect("/goodslist.jsp");//需要用重定向  这样地址栏不变
        }else if(method!=null&&method.equals("add"))
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(request.getParameter("name"));
//            System.out.println(request.getParameter("inprice"));

            GoodsEntity goodsEntity=new GoodsEntity();

            goodsEntity.setName(request.getParameter("name"));
            goodsEntity.setInprice(new BigDecimal(request.getParameter("inprice")));
            goodsEntity.setOutprice(new BigDecimal(request.getParameter("outprice")));
            goodsEntity.setDiscount(new BigDecimal(request.getParameter("discount")));
            goodsEntity.setKindName(request.getParameter("kind_name"));
            goodsEntity.setMinNum(Integer.parseInt(request.getParameter("min_num")));
            goodsEntity.setProductorName(request.getParameter("productor_name"));
            goodsEntity.setCount(0);

            System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}}{}{");
            GoodsDao dao=new GoodsDaoImpl();
            if(dao.insertGoods(goodsEntity)==true)//如果插入成功
            {
                System.out.println("successfully");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
            else
            {
                System.out.println("failure");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
        }else if(method.equals("delete"))
        {
            System.out.println("delete Goods    "+Integer.parseInt(request.getParameter("deleteGoodsId")));
            GoodsDao dao=new GoodsDaoImpl();
            int id=Integer.parseInt(request.getParameter("deleteGoodsId"));
            if(dao.deleteGoods(id))//如果插入成功
            {
                System.out.println("successfully");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
            else
            {
                System.out.println("failure");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }

        }else if(method.equals("search"))
        {
            System.out.println("Search Goods");

            //System.out.println(request.getParameter("start_time")+"   "+request.getParameter("start_time"));
            System.out.println(request.getParameter("words"));
            System.out.println(request.getParameter("kind")+"   "+request.getParameter("productor"));

            HashMap<String,String> map =new HashMap<String, String>() ;

            GoodsDao dao = new GoodsDaoImpl();

            // map.put("name",request.getParameter("words"));
             map.put("kind_name",request.getParameter("kind"));
            map.put("productor_name",request.getParameter("productor"));


            //GoodsDao dao=new GoodsDaoImpl();
           // HashMap<String,String> map =new HashMap<String, String>();

           // String kind_name="食物";
//            String iso = new String(kind_name.getBytes("UTF-8"),"ISO-8859-1");
//            String utf8 = new String(iso.getBytes("ISO-8859-1"),"UTF-8");
           // if(kind_name!= null )
             // map.put("name","小熊饼干");

            List<GoodsEntity> allGoodsList= dao.searchGoodsBy(map);

            if(allGoodsList!=null)
                for(GoodsEntity goodsEntity:allGoodsList)
                {
                    System.out.println(goodsEntity);
                }

            request.getSession().invalidate();
            request.getSession().setAttribute("allGoodsList", allGoodsList);
            response.sendRedirect("/servlet/GoodsServlet?method=getall");//需要用重定向  这样地址栏不变

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
