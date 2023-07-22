package MVCController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MVCModel.MVCData;
import MVCModel.MVCLogic;

/**
 * Servlet implementation class MVCInsert
 */
public class MVCInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MVCLogic ml = new MVCLogic();
	MVCData md = new MVCData();
	/**
     * @see HttpServlet#HttpServlet()
     */
    public MVCInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			
		md.setUsername(request.getParameter("dun"));
		md.setPassword(request.getParameter("dpw"));
	
	try {
		 ml.insertData(md);
			String SendUN;
			SendUN = "inserted";
			request.setAttribute("ack", SendUN);
			RequestDispatcher rd = request.getRequestDispatcher("ackmnt.jsp");
			rd.forward(request, response);

		}
		catch(Exception e)
		{
			
		}
	
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
