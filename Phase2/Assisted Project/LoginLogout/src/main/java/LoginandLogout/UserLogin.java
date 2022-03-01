package LoginandLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 
@WebServlet(name = "Login", urlPatterns = { "/Login" })
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 String id = "vishal@gmail.com";
		 String pass = "admin";
		 if(email.equals(id) && password.equals(pass))
		 {
			 HttpSession session=request.getSession();
			 session.setAttribute("key", email);
			 response.sendRedirect("dashboard");
		 }
		else 
		{
				response.sendRedirect("error");
		}
	}

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
