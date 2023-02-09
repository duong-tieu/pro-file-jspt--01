package com.example.managementproductservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ArrayShowProductServlet", value = "/ArrayShowProductServlet")
public class ArrayShowCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      Customer[] customers =
              {
                new Customer("vo minh tung","9/7/2003","Tien Giang","hinh1.png"),
                new Customer("dinh van teo","1/1/1111","ha noi","hinh2.png"),
                new Customer("Nguyen van ty","23/3/2013","hai phong","hinh3.png"),
                new Customer("tran van mo","16/6/2016","binh thuan","hinh4.png")
              };
      request.setAttribute("customers",customers);
      RequestDispatcher rp = request.getRequestDispatcher("CustomerShow.jsp");
      rp.forward(request,response);
    }
}
