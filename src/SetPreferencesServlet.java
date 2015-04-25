

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetPreferencesServlet
 */
@WebServlet("/SetPreferences")
public class SetPreferencesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetPreferencesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String backgroundColor = request.getParameter("backgroundColor");
		String fontColor = request.getParameter("fontColor");
		String postColor = request.getParameter("postColor");
		
		HttpSession session = request.getSession();
		session.setAttribute("backgroundColor", backgroundColor);
		session.setAttribute("fontColor", fontColor);
		session.setAttribute("postColor", postColor);
		
		Cookie c = new Cookie("backgroundColor", backgroundColor);
		 c = new Cookie("fontColor", fontColor);
		 c = new Cookie("postColor", postColor);
		
		request.getRequestDispatcher("Main.jsp")
			.forward(request, response);
	}

}
