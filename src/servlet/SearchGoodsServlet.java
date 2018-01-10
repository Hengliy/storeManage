package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SearchGoodsServlet",urlPatterns = "/servlet/SearchGoodsServlet")
public class SearchGoodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("***********doPost_servlet*********************");

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

//        GoodsEntity newGoods=new GoodsEntity();
//        newGoods.setName(request.getParameter("name"));
//        newGoods.setInprice(request.getParameter("inprice"));
//
//        GoodsDao dao = new GoodsDaoImpl();

        System.out.println(request.getParameter("kind"));
        System.out.println(request.getParameter("word"));

        //request.getRequestDispatcher("/goods.jsp").forward(request, response);//请求转发

        response.sendRedirect("/goodslist.jsp");//需要用重定向  这样地址栏不变

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
