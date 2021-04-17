package returnType;

public class BasicsOfReturnAndVoidMethod {

	public static void main(String[] args) {
	
	BasicsOfReturnAndVoidMethod brm = new BasicsOfReturnAndVoidMethod();
	brm. m1();
	brm. m2();
	}
	public void m1() {	
		
		String FirstName="zubaida";
		System.out.println(FirstName);
	}
	
	// void method is final, you cannot modify it
	
	
	public String m2() {
		
			String FirstName="zubaida";
		
		System.out.println(FirstName);
		
		return FirstName;
		
		}

	//return method has option to edition,modification
	//you must declare data type	
	//you must return same data type
	//return must be the last statement
		
	public int m3() {
	
	int checking=1500;
	int saving=2000	;	
	int total= checking+saving;
	
	System.out.println(total);
	return total;
	}

	}
