package servlet;

import daoimpl.StaffDaoImpl;
import entity.StaffEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StaffServlet",urlPatterns = "/servlet/StaffServlet")
public class StaffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("***********doPost_servlet*********************");

        String method=request.getParameter("method");
        if("getall".equals(method)) {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");

            List<StaffEntity> allStaffsList = new ArrayList<StaffEntity>();

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            StaffDaoImpl dao = new StaffDaoImpl();

            //allStaffsList=dao.getAllStaff();

            request.getSession().setAttribute("allStaffList", allStaffsList);

            //request.getRequestDispatcher("/goods.jsp").forward(request, response);//请求转发

            response.sendRedirect("/staff.jsp");//需要用重定向  这样地址栏不变
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
