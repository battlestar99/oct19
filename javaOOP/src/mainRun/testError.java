package mainRun;

public class testError {

	public static void main(String[] args) throws InterruptedException {
		
	int a= 24; 
	int b =0; 
	int c=6;
	
	try {
	c=a/b;
	}
	catch(ArithmeticException e) {
		
		System.out.println(e.getMessage());
		
	}
	
	System.out.println("The value of c");
	
	System.out.println(c);
	
		

	}

}
