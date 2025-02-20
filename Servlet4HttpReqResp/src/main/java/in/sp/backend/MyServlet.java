package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/SubmitForm")
public class MyServlet  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myName = req.getParameter("name1");
		String myEmail = req.getParameter("email1");
		
		System.out.println("My Name 1 : " + myName);	//Print in the console 
		System.out.println("My Email 2 : " + myEmail);
		
		PrintWriter out = resp.getWriter();	//to print on the web browser
		out.println("Name : "+myName);
		out.println("Email : "+myEmail);
	}
}
