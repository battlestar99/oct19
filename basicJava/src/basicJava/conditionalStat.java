package basicJava;

public class conditionalStat {

	public static void main(String[] args) {
		
		int x = 109; 
		int y = 109;
		
		int numberone = 100; 

		boolean z = (x==y);
		boolean test=(x>y);
		boolean testOne = (x<y);
		
		if(z) {
			numberone=200;
		System.out.println("x is equal to y");
		System.out.println(numberone);
		}
		
		if(test) {
			numberone=400;
		System.out.println("x is greater than y");
			
		}
		if(testOne) {
			numberone=500;
			System.out.println("x is less than y");
			
		}
		
		//System.out.println("out of the if condition");	
	}

}
