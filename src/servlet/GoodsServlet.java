package servlet;

import dao.GoodsDao;
import daoimpl.GoodsDaoImpl;
import entity.GoodsEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
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

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

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
            System.out.println(request.getParameter("name"));
            System.out.println(request.getParameter("inprice"));

            GoodsEntity goodsEntity=new GoodsEntity();
//
//            goodsEntity.setName(request.getParameter("name"));
//            goodsEntity.setInprice(new BigDecimal(request.getParameter("inprice")));
//            goodsEntity.setOutprice(new BigDecimal(request.getParameter("outprice")));
//            goodsEntity.setDiscount(new BigDecimal(request.getParameter("discount")));
//            goodsEntity.setKindName(request.getParameter("kind_name"));
//            goodsEntity.setMinNum(Integer.parseInt(request.getParameter("min_num")));

            GoodsDao dao=new GoodsDaoImpl();
            if(dao.insertGoods(goodsEntity)!=null)//如果插入成功
            {
                System.out.println("failure");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
            else
            {
                System.out.println("successfully");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
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
