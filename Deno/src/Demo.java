

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Servlet is running");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String x = request.getParameter("a");
		String y = request.getParameter("b");
		String ch = request.getParameter("ch");
		int count =0;
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		switch(ch)
		{
		case "Add":
			out.println("Addition is = "+(a+b));
			break;
		case "Sub":
			out.println("Subtraction is = "+(a-b));
			break;
		case "Mul":
			out.println("Multiplication is = "+(a*b));
			break;
		case "Div":
			out.println("Division is = "+(a/b));
			break;	
		case "Square":
			out.println("Square is = "+(a*a));
			break;
		case "Cube":
			out.println("Square is = "+(a*a*a));
			break;
		case "Fibo":
			while(count == a)
			{
				int fibo = count + (count + 1);
				out.println(fibo);
			}
			break;
		}
		
	}
}


