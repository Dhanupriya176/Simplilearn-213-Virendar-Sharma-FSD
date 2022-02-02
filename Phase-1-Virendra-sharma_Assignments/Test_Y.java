package AccessModifiers;

public class Test_Y {
public static class TestY extends TestN {
		

		public static void main(String[] args){
			TestM ObjTestM = new TestM();
			ObjTestM.methodPublic();
			
			TestY ObjTestY = new TestY();
			ObjTestY.methodProtected();
			ObjTestY.methodPublic();
			
			TestX ObjTestX = new TestX();
			System.out.println("long variable of class X: " +ObjTestX.b3);
			System.out.println("float variable of class X: " +ObjTestX.c3);
			System.out.println("char variable of class X: " +ObjTestX.k);



		}

	}
}


