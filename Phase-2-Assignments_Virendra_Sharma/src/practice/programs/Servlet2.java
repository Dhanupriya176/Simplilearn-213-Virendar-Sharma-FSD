package practice.programs;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response){
  try{
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();
     
      HttpSession session=request.getSession(false);
      
      String u =(String)session.getAttribute("username");
      String p =(String)session.getAttribute("pass");
      
 
      
      pwriter.print("Name: "+ u +" Pass: "+ p);
      pwriter.close();
  }catch(Exception exp){
      System.out.println(exp);
   }
  }
}