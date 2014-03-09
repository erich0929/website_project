import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class adder extends HttpServlet {
		public void doGet (HttpServletRequest req, HttpServletResponse response)
				throws IOException, ServletException {

		String str1 = req.getParameter ("NUM1");
		String str2 = req.getParameter ("NUM2");

		int num1 = Integer.parseInt (str1);
		int num2 = Integer.parseInt (str2);
		int sum = num1 + num2;

		response.setContentType ("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter ();
		out.println ("<HTML>");
		out.println ("<HEAD><TITLE>덧셈 프로그램 - 결과화면</TITLE></HEAD>");
		out.printf ("%d + %d = %d", num1, num2, sum);
		out.println ("</BODY></HTML>");
		
		}
}
