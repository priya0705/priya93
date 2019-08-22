package org.us;

public class NullPoinEx {

	
	public static void main(String[] args) {
		try{
			String name ="arun";
            System.out.println(name.length());
		}
		catch(NullPointerException e){
		    System.out.println("name is null");
		   
		   e.printStackTrace();
		    
		    }
		catch(Exception e){
			System.out.println("rest of code");
		
	    }
		finally{
			System.out.println("Exception handled");
		}

}}
