package com.ecommerce.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.dao.HibernateUtil;
import com.ecommerce.entity.Customers;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("cname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		Customers c = (Customers) session.getAttribute("cust");
		int cid = c.getId();
		Customers cust = new Customers();
		cust.setId(cid);
		cust.setName(name);
		cust.setEmail(email);
		cust.setPassword(password);
		CustomerDAO.updateUser(cust);
		
		response.getWriter().print("Data Updated Successfully...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
