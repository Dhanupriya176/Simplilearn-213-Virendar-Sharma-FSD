package Project1;

import java.util.Scanner;
	
	public class ArithmeticCalculator {
		
			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the two numbers");
				int Num1=sc.nextInt();
				int Num2= sc.nextInt();
				System.out.println("Enter the operator ");
				char op=sc.next().charAt(0);
				double Ans=0;

				switch(op){
				case '+': Ans=Num1+Num2;
				break;
				case '-':Ans=Num1-Num2;
				break;
				case '*': Ans=Num1*Num2;
				break;
				case '/':Ans=Num1/Num2;
				break;
				}
				System.out.println("The Answer is " +Ans);
			}
		}

