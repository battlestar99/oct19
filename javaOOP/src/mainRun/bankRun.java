package mainRun;

import javaOOP.bankAccount;

public class bankRun {
	
	public static void main(String args[]) {
		
		
		bankAccount user1=new bankAccount(6423986);
		
		bankAccount user2=new bankAccount();
		
	
	
		bankAccount user3; 
		user3=new bankAccount(53242);
		
		bankAccount user4=new bankAccount();
		
		
		System.out.println(user1.accountNumber);
		System.out.println(user4.accountNumber);
		user1.accountEmail="web@gmail.com";
		user3.accountName="Bob Vance";
		System.out.println(user1.accountEmail);
		
		
		
		
	}

}
