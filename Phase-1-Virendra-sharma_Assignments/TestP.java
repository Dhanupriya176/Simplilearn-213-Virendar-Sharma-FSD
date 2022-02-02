package AccessModifiers;

public class TestP {
	public static void main(String args[]) {
		new TestM().methodPublic();
		new TestM().methodProtected();
		new TestM().methodDefault(); 
		new TestN().methodPublic();
		new TestN().methodProtected();
		new TestN().methodDefault(); 
		
	}

	public void methodPublic() {
		System.out.println("Class TestM: methodPublic");
		System.out.println("Class TestN: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class TestM: methodProtected");
		System.out.println("Class TestN: methodPublic");
	}

	void methodDefault() {
		System.out.println("Class TestM: methodDefault");
		System.out.println("Class TestN: methodPublic");
	}

	private void methodPrivate() {
		System.out.println("Class TestM: methodPrivate");
		System.out.println("Class TestN: methodPublic");
	}

}

