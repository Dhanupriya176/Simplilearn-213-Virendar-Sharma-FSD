package TryCtach;

public class TryCatch1 {
	 public static void main(String[] args) {  
         
         try{ 
      	   try{
      		   System.out.println("try Block1");
	                int a[]=new int[5];    
	                a[5]=30/0;
      	   }
      	   catch(ArithmeticException e1) {
	            	  System.out.println("Block1 Exception: e1");

      	   }  
      	   try{
      		   System.out.println("Try Block2");
	                int a[]=new int[5];    
	                a[6]=9;
      	   }
      	   catch(ArithmeticException e2) {
	            	  System.out.println("Block1 Exception: e2");

      	   }  
      	   catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
         
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }   
         }
         finally{
      	   System.out.println("rest of the code");
         }
         }
}

