package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login extends HttpServlet {
	
	//you can check using doGet, doPost and service method also
	//get - doGet()
	//post - doPost()
	//both - service()
	
	@Override	//doPost method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myEmail = request.getParameter("email1");
		String myPass = request.getParameter("pass1");
		
		
		if (myEmail.equals("sj967334@gmail.com")  &&  myPass.equals("Sumit4403")) {
			
			System.out.println("Login successfully...");
			
		}
		else {
			System.out.println("Do not login due to some error...");
		}
	}
}
