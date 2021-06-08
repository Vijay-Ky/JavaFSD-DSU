package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    //we need to override service method
    	public void service(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException
    	{
    		//we need PrintWriter to write something to the browser
    		PrintWriter out = response.getWriter();
    		//in order to read any input use request object get parameter method
    		String  s1 = request.getParameter("firstName");
    		String  s2 = request.getParameter("lastName");
    		out.println("First Name:" + s1);
    		out.println("Last Name:" + s2);
    	}
}
