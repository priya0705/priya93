package org.india;

public class BankInfo extends AxisBank {
	
	public void  getSavingacc(int accno){
	 System.out.println("savings amount is 20000");	
	}
	public void  getFixedacc(int accno){
		 System.out.println("Fixed amount is 30000");	
		}
	public void getdeposit(int accno){
		
		 System.out.println("deposit amount is 70000");
	}
	public static void main(String[] args) {
		BankInfo bf= new BankInfo();
		bf.getSavingacc(55656);
		bf.getdeposit(65656);
		bf.getFixedacc(68566);

	}

}