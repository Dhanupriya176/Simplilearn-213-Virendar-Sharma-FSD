package practice.programs;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class Servlet1 extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    
	try{  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n =request.getParameter("userName");  
    out.print("Welcome "+ n);  
    String p =request.getParameter("pass");  
    out.print("your password is "+ p);  
  
    Cookie ck=new Cookie("username",n);		//creating cookie object  
    response.addCookie(ck);	
    Cookie pk=new Cookie("pass",p);		//creating cookie object  
    response.addCookie(ck);	//adding cookie in the response  
  
    //creating submit button  
    out.print("<form action='serv2'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}  