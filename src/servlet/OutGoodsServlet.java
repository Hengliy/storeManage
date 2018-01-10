package servlet;

import dao.OutGoodsDao;
import daoimpl.InGoodsDaoImpl;
import daoimpl.OutGoodsDaoImpl;
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
import java.util.ArrayList;
import java.util.List;

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
