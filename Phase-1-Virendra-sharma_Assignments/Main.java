package Inheritance;

class product{	
int id=78;
String name="Amul";

void display(){
	System.out.println("Id : "+id+" "+"Name : "+name);
}
}
class A extends product{
int count=50;
String category="Butter";

void display(){
	System.out.println("Id : "+id+" "+"Name : "+name+" "+"Count :"+count+" "+"Category :"+category);
}
}

class B extends product{
int count=90;
String category="Milk";

void display(){
	System.out.println("Id : "+id+" "+"Name :"+name+" "+"Count :"+count+" "+"Category :"+category);
	
}
}

class C extends product{
int count=56;
String category="choco";

void display(){
	System.out.println("Id :"+id+" "+"Name :"+name+" "+"Count :"+count+" "+"Category :"+category);
	
}
}


class subA extends A{
int price=30;
int totalprice=count*price;

void display(){
	System.out.println("Id :"+id+" "+"Name :"+name+" "+"Count :"+count+" "+"Category :"+category);
	
}
}


class subB extends B{
int price=10;
int totalprice=count*price;

void display(){
	System.out.println("Id :"+id+" "+"Name :"+name+" "+"Count :"+count+" "+"Category :"+category);
	
}
}

public class Main{
	
	public static void main(String[] args) {
		
		subB B=new subB();
		subA A=new subA();
		C c=new C();
		A.display();
		B.display();
		c.display();
	}
}
