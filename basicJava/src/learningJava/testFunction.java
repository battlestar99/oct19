package learningJava;

public class testFunction {
	

	
	// non static functions 
	public static int addtwoNumbers(int x, int y) {
		
		int sum = x+y; 
		return sum; 
		
		
	}
	
	// take one string as input, and print the value of the string
	
	public void printValue(String name) {
		
		System.out.println(name);
		
	}
	
	public void addthreeNumbers(int x, int y, int z) {
		
		int sum=x+y+z; 
		System.out.println(sum);
		
	}
	
	public boolean compare(int numberone, int numbertwo) {
		
		boolean test=true; 
		
		if(numberone>numbertwo) {
			
			test=true; 
			
		}
		
		else {
			
			test=false; 
		}
		return test; 
		
	}
	
	
	// 2 string as input, and concatanate the string and print
	// the value and also return the value 
	
	public String concat(String x1, String x2) {
		
		String add = x1 + " " + x2 ; 
		System.out.println(add);
		return add; 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
