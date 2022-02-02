package AccessModifiers;

public class TestM {
	private int a = 20;
	
	long b = 1000;
	
	protected float c = 45.56f;
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	public void methodProtected(){   // protected method
		methodPrivate();
	}
	
	 public void methodDefault(){    //default method
		methodPrivate();
	}
	
	public void methodPrivate(){     // private method
		System.out.println("Class TestM: methodProtected");
		System.out.println("value of protected value c" + c);
		System.out.println("Value of private value "+ a);
		System.out.println("Value of long "+ b);
	}

	

	}


