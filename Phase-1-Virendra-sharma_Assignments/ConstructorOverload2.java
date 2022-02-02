package Methods;

public class ConstructorOverload2 {
	int a1;
	int b1;
	int c1;
	long s1;
	public void calculate(int p,long q){
		long d1=((p*q)/2);
		System.out.println("Area of rohmbus = "+d1);
	}
	public ConstructorOverload2(){
		System.out.println("Default constructor");
	}
	ConstructorOverload2(int a){
		int a1=a;
	}
	ConstructorOverload2 (int a,int b){
		int a1=a;
		int c1=b;
	}
	ConstructorOverload2(long r){
		long s1=r;
	}
	
	void area(){
		System.out.println("Area of rectangle = " + (a1*c1));
		System.out.println("Area of Square = " + (a1*a1));
		System.out.println("Area of Cicrle = " + (3.14*b1*b1));
	}
	public static void main (String[] args){
		ConstructorOverload2 ob =new ConstructorOverload2();
		ob.calculate(2,1);
		ConstructorOverload2 ob1 =new ConstructorOverload2(2);
		ob1.area();
		ConstructorOverload2 ob3 =new ConstructorOverload2(2,5);
		ob3.area();
		ConstructorOverload2 ob4=new ConstructorOverload2(3L);
		ob4.area();
	}

}