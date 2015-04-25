import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CheckerServlet
 */
@WebServlet("/CheckerServlet")
public class CheckerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String backgroundColor = "white";
		String fontColor = "white";
		String postColor = "green";
		
		Cookie[] cookieList = request.getCookies();
		
		if(cookieList != null){
			for(Cookie c: cookieList)
			{
				
				
			}
		}
		
		request.getSession().setAttribute("backgroundColor", backgroundColor);
		
		request.getSession().setAttribute("fontColor", fontColor);
		
		request.getSession().setAttribute("postColor", postColor);
		
		request.getRequestDispatcher("Main.jsp")
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
