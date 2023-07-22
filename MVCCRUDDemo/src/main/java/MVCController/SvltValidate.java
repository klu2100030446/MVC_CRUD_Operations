package MVCController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import MVCModel.*;
public class SvltValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    MVCLogic ml =new MVCLogic();
    
    public SvltValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("Servlet Loaded");
		MVCData md = new MVCData();
		md.setUsername(request.getParameter("lun"));
		md.setPassword(request.getParameter("lpw"));
		try
		{
			if(ml.MVCValidate(md)== true)
			{
				String SendUN;
				SendUN = request.getParameter("lun");
				request.setAttribute("res", SendUN);
				RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
				rd.forward(request, response);
			}
			else
			{
				pw.print("Invalid Credentials!");
			}

		}
		catch(Exception e)
		{
			
		}
		String UN;
		String PW;
		UN = request.getParameter("lun");
		PW = request.getParameter("lpw");
		pw.print("The User Name you have entered is " + UN);
		pw.print("The Password you have entered is " + PW);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
