package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
//            List<IngoodsEntity> allGoodsList= new ArrayList<IngoodsEntity>();
//
//            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//
//            InGoodsDaoImpl dao = new InGoodsDaoImpl();
//
//            allGoodsList=dao.getAllInGoods();
//
//            request.getSession().setAttribute("allGoodsList",allGoodsList);

            response.sendRedirect("/ingoods.jsp");//需要用重定向  这样地址栏不变
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
