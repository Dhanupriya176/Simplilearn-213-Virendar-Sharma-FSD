package Strings;

public class StringDemo {
	
		  
			 public static void main(String args[]){  
				 
			   String t = "delhi";  // String Literal---> objects are created in string pool
			   String o = "mumbai";
			   String k = "Delhi";
			   String y = new String("mumbai");
			   String l= new String("delhi");
			   String p = new String("Hello");
			  
			   
			   if(o.equals(l))
			   {
				   System.out.println("true....");
			   }
			   
			   else{
				   System.out.println("false....");
			   
			   }
			   if(y.equals(p))
			   {
				   System.out.println("true....");
			   }
			   
			   else{
				   System.out.println("false....");
			   
			   }
			   if(t.equals(o))
			   {
				   System.out.println("true....");
			   }
			   
			   else{
				   System.out.println("false....");
			   
			   }
			   if(k.equals(y))
			   {
				   System.out.println("true....");
			   }
			   
			   else{
				   System.out.println("false....");
			   
			   }
			   if(p.equals(y))
			   {
				   System.out.println("true....");
			   }
			   
			   else{
				   System.out.println("false....");
			   
			   }
			   
			 }
	}

