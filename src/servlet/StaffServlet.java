package servlet;

import dao.GoodsDao;
import dao.StaffDao;
import daoimpl.GoodsDaoImpl;
import daoimpl.StaffDaoImpl;
import entity.GoodsEntity;
import entity.StaffEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
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

            List<StaffEntity> allStaffList = new ArrayList<StaffEntity>();

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

            StaffDaoImpl dao = new StaffDaoImpl();

            allStaffList=dao.getAllStaff();

            System.out.println(allStaffList.get(0).getUsername());


            request.getSession().invalidate();

            request.getSession().setAttribute("allStaffList", allStaffList);

            //request.getRequestDispatcher("/goods.jsp").forward(request, response);//请求转发
            response.sendRedirect("/staff.jsp");//需要用重定向  这样地址栏不变
        }
        else if(method!=null&&method.equals("add"))
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//            System.out.println(request.getParameter("name"));
//            System.out.println(request.getParameter("inprice"));

            StaffEntity staffEntity= new StaffEntity();
            staffEntity.setUsername(request.getParameter("name"));
            staffEntity.setBroth(new Date(Long.valueOf(request.getParameter("birth"))));
            staffEntity.setPassword(request.getParameter("password"));
            staffEntity.setSex(request.getParameter("sex"));
            staffEntity.setTel(request.getParameter("tel"));
            System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}}{}{");
            StaffDao dao=new StaffDaoImpl();
            if(dao.insertStaff(staffEntity)==true)//如果插入成功
            {
                System.out.println("successfully");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
            else
            {
                System.out.println("failure");
                response.sendRedirect("GoodsServlet?method=getall");//需要用重定向  这样地址栏不变
            }
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
