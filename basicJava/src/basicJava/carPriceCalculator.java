package basicJava;

import java.util.Scanner;

public class carPriceCalculator {

	public static void main(String[] args) {
// we want to create a software to calculate car price 
		
		// baseprice, warrenty, interest rate, monthly payment
		
		int basePrice; 
		int warrentyPrice; 
		int dealerfee; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Base Price for the car");
		basePrice=input.nextInt();
		System.out.println("Enter warrenty for the car");
		warrentyPrice=input.nextInt(); 
		System.out.println("Enter dealer fee for the car");
		dealerfee = input.nextInt(); 
		
		int finalprice; 
		
		finalprice=basePrice+warrentyPrice+dealerfee; 
		
		System.out.println("This is the final price of the car");
		System.out.println(finalprice);
		
		

	}

}
