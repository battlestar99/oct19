package javaOOP;

public class bankAccount {
	
	
	public String accountName; 
	public String accountEmail; 
	public String userName; 
	public String password; 
	public int moneyDeposited; 
	public static int numberofUsers; 
	public int accountNumber; 
	
	
	// constructor overloading 
	public bankAccount(int accountNumber) {
		
		
		this.accountNumber=accountNumber;
		
	}

	
	public bankAccount() {
		
		System.out.println("object with no consturctor");
		
	}
	
	// function or method overloading 
	public void depositMoney() {
		
		
	}
    
	
	

	
	public void withdrawMoney() {
		
		
		
	}
	
	public void transferMoney() {
		
		
		
	}
	
	public void changeAccountEmail() {
		
		
		
	}
	
	
}
