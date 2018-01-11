package servlet;

import dao.GoodsDao;
import dao.OutGoodsDao;
import daoimpl.GoodsDaoImpl;
import daoimpl.InGoodsDaoImpl;
import daoimpl.OutGoodsDaoImpl;
import entity.GoodsEntity;
import entity.OutgoodsEntity;
import entity.VIngoodsEntity;
import entity.VOutgoodsEntity;

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
import java.util.List;
import java.util.Random;

@WebServlet(name = "OutGoodsServlet",urlPatterns = "/servlet/OutGoodsServlet")
public class OutGoodsServlet extends HttpServlet {
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
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            OutGoodsDao dao = new OutGoodsDaoImpl();

            List<VOutgoodsEntity> allVOutGoodsList = dao.getAllVOutGoods();

            request.getSession().invalidate();

            System.out.println(allVOutGoodsList.get(0).getGoodsName());

            request.getSession().setAttribute("allVOutGoodsList",allVOutGoodsList);

            response.sendRedirect("/outgoods.jsp");//需要用重定向  这样地址栏不变
//        }
        }if(method!=null&&method.equals("add"))
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(request.getParameter("name"));
//            System.out.println(request.getParameter("inprice"));

            OutgoodsEntity goodsEntity= new OutgoodsEntity();

            goodsEntity.setGoodsName(request.getParameter("name"));
            goodsEntity.setCount(Integer.parseInt(request.getParameter("count")));
            goodsEntity.setStaffId((short) 1);
            goodsEntity.setOutdate(new Timestamp(System.currentTimeMillis()));
            goodsEntity.setNum(new Random().nextInt(1000)+"");

            System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}}{}{");
            OutGoodsDao dao=new OutGoodsDaoImpl();
            if(dao.insertOutGoods(goodsEntity))//如果插入成功
            {
                System.out.println("successfully");
                response.sendRedirect("OutGoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
            else
            {
                System.out.println("failure");
                response.sendRedirect("OutGoodsServlet?method=getall");//需要用重定向  这样地址栏不变
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
