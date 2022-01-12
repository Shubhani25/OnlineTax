

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TaxProcessor extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("t2");
		String s[] = request.getParameterValues("t3");
		//process data
		int tax=0;
		int income = Integer.parseInt(s1);
		int age = Integer.parseInt(s2);
		
		if(income>=500000) {
			tax = income*20/100;
		}
		
		else if(income<500000 && income>=300000) {
			tax = income*10/100;
		}
		
		if(age>=60) {
			tax = tax - (tax*10/100);
		}
		
		int srch=0;
		if(s!=null) {
			srch = s.length*500;
		}
		
		//provide response
		PrintWriter out = response.getWriter();
		out.println("Thanks!");
		out.println("Your payable tax is "+tax);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
