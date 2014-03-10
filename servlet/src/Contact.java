import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Contact extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res)
						throws ServletException, IOException {
		process (req,res);
	}

	public void doPost (HttpServletRequest req, HttpServletResponse res)
						throws ServletException , IOException {
		process (req, res);
	}

	public void process (HttpServletRequest req, HttpServletResponse res) 
						throws ServletException, IOException {
		
		res.setContentType ("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter ();
		req.setCharacterEncoding ("UTF-8");
		String name = req.getParameter ("name");
		String email = req.getParameter ("email");
		
		out.println ("<html>");
		out.println ("<head><title>연락처</title></head>");
		out.println ("<body><h3>연락처</h3>");
		out.println ("<a href=mailto :" + email + ">" + name + "</a>");
		out.println ("</body></html>");

	}
}
