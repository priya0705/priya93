package org.com;

public class Bank implements RBI{

	public void carLoanInterest(){
		System.out.println(" car loan interest is 10%");
	}
	
	public void bikeLoanInterest(){
		System.out.println(" Bike loan interest is 12% ");
	}
	public void homeLoanInterest(){
		System.out.println(" Home loan interest is 7% ");
	}
	
	public void currentAccount(){
		System.out.println("This is Current Account");
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.carLoanInterest();
		b.bikeLoanInterest();
		b.homeLoanInterest();
		b.currentAccount();
		
	}

	public void bikeLoaninterest() {
		// TODO Auto-generated method stub
		
	}

	
	}


