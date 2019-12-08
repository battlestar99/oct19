package oopConcept;

public class home {
	
	
// any non runnable class can have two things 
	// functions and properties 
	// global variables of properties of the class
	
	// global variable
	int numberofDoors; 
	String nameofThehome;
	int x; 
	
	static int numberoffacebookuser;
	static String name; 
	
	
	
	
	public home(int x, String y) {
		
		
		numberofDoors=x;
		 nameofThehome=y;
	}
	
	public home() {
		
		System.out.println("constructro with no input");
		
	}
	
	
	public static void test() {
		
		
		
	}
	
	// function and method overloading 
	
	
	public void doorOpen() {
		
		int x = 15; 
		
		
		System.out.println(this.x);
		System.out.println("function with no input");
	  
		
	}
	
	public int doorOpen(int x) {
		
		System.out.println("function with input");
		return 12; 
	}
	
	
	
	
	
	
	public void doorclose() {
		
		System.out.println("the door is closed");	
		
	}
	
	
	
	

}
