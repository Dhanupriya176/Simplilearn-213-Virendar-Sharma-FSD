package AccessModifiers;

public class TestX {


	public char k = 25;
	
	private int a3 = 30;
	
	long b3= 1300;
	
	protected float c3 = 45.56f;
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){     // private method
		System.out.println("Class TestM: methodProtected");
		System.out.println("value of protected value c3 " + c3);
		System.out.println("Value of private value a3"+ a3);
		System.out.println("Value of long"+ b3);
		System.out.println("Value of age" +k);
		
	}
		}

