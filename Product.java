package com.ecommerce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("pname");
		int price =Integer.parseInt(request.getParameter("price"));
		HttpSession session = request.getSession();
		Product product = new Product();
		product.setPid(101);
		product.setPid(pname);
		
		
		session.setAttribute("product", product);
		
		response.sendRedirect("showProduct.jsp");
	}

	
	private void setPid(int i) {
		// TODO Auto-generated method stub
		
	}


	private void setPid(String pname) {
		// TODO Auto-generated method stub
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
