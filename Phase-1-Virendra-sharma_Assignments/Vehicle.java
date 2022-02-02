package Inheritance;

		 
			
	abstract class Vehicle {
		 int speed = 70;
		 long distance = 50;
		 void run(){
	
		  System.out.println("vechicle is ready to start");  // abstract method()
		  }
		  void Stop(){
			  System.out.println("vechicle is ready to stop");
		  }
		  void display(){
			  
		  }


		public void fuel(int b)
	    {
	         System.out.println("go slow" );
	    }// non-abstract method()

		public void fuel(float f, String s)
	    {
	         System.out.println("follow rules");
	    }// non-
		public void fuel(char c,int k)
	    {
	         System.out.println("use horn");
	    }
	}
	class TwoWheeler extends Vehicle{
	int speed = 60;
	long distance = 70;
	int num_of_tire=2;

	TwoWheeler(){
	 System.out.println("default constructor of two wheeler");
	}
	void run() {
	 System.out.println("vechicle is ready to start");
	}
	void stop(){
	 System.out.println("vechicle is ready to stop");
	}

	public void display(){
	System.out.println("Speed of 2 wheeler :" + speed);
	System.out.println("Milage of 2 wheeler :" +distance);
	System.out.println("Number of tires in 2 wheeler :" +num_of_tire);
	System.out.println("Speed of vechicle :" +super.speed);
	System.out.println("Milage of vechicle :" +super.distance);
	}
	}
	class ThreeWheeler extends Vehicle{
		 int speed = 60;
		 long distance = 70;
		 int num_of_tire=2;
			
		 ThreeWheeler(){
			 System.out.println("default constructor of three wheeler");
		 }
		 void run() {
			 System.out.println("vechicle is ready to start");
		}
		 void stop(){
			 System.out.println("vechicle is ready to stop");
		 }
		 
	public void display(){
		 System.out.println("Speed of 3 wheeler :" + speed);
		 System.out.println("Milage of 3 wheeler :" +distance);
		 System.out.println("Number of tires in 3 wheeler :" +num_of_tire);
		 System.out.println("Speed of vechicle :" +super.speed);
		 System.out.println("Milage of vechicle :" +super.distance);
	}
	}
	class FourWheeler extends Vehicle{
	 int speed = 60;
	 long distance = 70;
	 int num_of_tire=2;
		
	 FourWheeler(){
		 System.out.println("default constructor of four wheeler");
	 }
	 void run() {
		 System.out.println("vechicle is ready to start");
	}
	 void stop(){
		 System.out.println("vechicle is ready to stop");
	 }
	 
	public void display(){
	 System.out.println("Speed of 4 wheeler :" + speed);
	 System.out.println("Milage of 4 wheeler :" +distance);
	 System.out.println("Number of tires in 4 wheeler :" +num_of_tire);
	 System.out.println("Speed of vechicle :" +super.speed);
	 System.out.println("Milage of vechicle :" +super.distance);
	}
	}
 class EightWheeler extends Vehicle{
	 int speed = 60;
	 long distance = 70;
	 int num_of_tire=2;
		
	 EightWheeler(){
		 System.out.println("default constructor of Eight wheeler");
	 }
	 void run() {
		 System.out.println("vechicle is ready to start");
	 }

	 void stop(){
		 System.out.println("vechicle is ready to stop"); 
	 }
	 
	 
	public void display(){
	 System.out.println("Speed of 8 wheeler :" + speed);
	 System.out.println("Milage of 8 wheeler :" +distance);
	 System.out.println("Number of tires in 8 wheeler :" +num_of_tire);
	 System.out.println("Speed of vechicle :" +super.speed);
	 System.out.println("Milage of vechicle :" +super.distance);
	}

public class Main1{
	
	 public void main(String[] args){
		 
		Vehicle v = new EightWheeler();
		v.run();
		v.Stop();
		v.display();
		v.fuel(2);
		v.fuel(2.7f, "fuel");
		v.fuel('v',7);
	}
	}
 }


