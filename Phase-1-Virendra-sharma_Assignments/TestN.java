package AccessModifiers;

public class TestN {
	
		
		protected long l = 56677L;
		
		public int a1= 20;
		
		double d = 12.111186897698706;
		
		public void methodPublic(){
		   // public method
			methodPrivate();
		}
		
		 public void methodProtected(){ 
			// protected method
			methodPrivate();
		}
		
		public void methodDefault(){
			//default method
			methodPrivate();
		}
		
		 void methodPrivate(){     // private method
			System.out.println("Class TestN: methodProtected");
			System.out.println("Value of protected value l"+ l);
			System.out.println("Value of a1"+ a1);
			System.out.println("value of double" +d);
		}
	}

