package org.us;

public class ArithmaticException {

	
	public static void main(String[] args) {
		
		
	try{
			int tot=6/0;
			System.out.println(tot);
					
		} catch(ArithmeticException ae){
			System.out.println("value should not be zero");	
			}
		   catch(Exception e){
			   System.out.println("name is null");
		   }
		
		
		   
	}

}
