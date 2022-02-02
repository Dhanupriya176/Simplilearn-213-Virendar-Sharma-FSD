package ExceptionHandling;

public class InnerClass {

		private int data=30;  
		private int text=25;
		void display(){
			System.out.println("i am inside the outer class method");
		}
		 
		class Inner{  		
		 //private int data=20;
		  
		  void msg()
		  {
			  System.out.println("data is "+data);
		  }  
		  
		  // calling the duplicate method of the outer class
		  void display(){
			  System.out.println("i am inside the inner class method");
		  }// inner class accessing the outside private variable
		 }  
		class Inner2{
			void text()
			{
				 System.out.println("text is "+text);
			}
				 void display1(){
					  System.out.println("i am inside the inner2 class method");
				 
			}
				public void display() {
					// TODO Auto-generated method stub
					
				}
		}
		
		public void main(String args[]){  
		  
			InnerClass obj=new InnerClass ();     // creating object of Outer class
		 
		 
			InnerClass.Inner2 in=obj.new Inner2(); 
		  in.text();//
		  
		  //creating object of Inner class
		  in.display(); 
		 }  
		} 

