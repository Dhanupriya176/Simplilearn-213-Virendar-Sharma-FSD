package AccessModifiers;

public class Test_Z {
	public static class TestZ extends TestM {

		public static void main(String[] args) {
				TestZ ObjTestZ = new TestZ();
				ObjTestZ.methodProtected();
				ObjTestZ.methodPublic();
				
				TestM ObjTestM = new TestM();
				ObjTestM.methodPublic();
				
				TestP ObjTestP =new TestP();
				ObjTestP.methodPublic();
				
				TestX ObjTestX = new TestX();
				System.out.println("long variable of class X: " +ObjTestX.b3);
				System.out.println("float variable of class X: " +ObjTestX.c3);
				System.out.println("char variable of class X: " +ObjTestX.k);

			}

		}
	}



