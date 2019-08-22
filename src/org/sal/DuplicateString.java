package org.sal;



public class DuplicateString {

	
	public static void main(String[] args) {
	
		String str=" This is a book";
		int cnt=0;
		char[] c= str.toCharArray();
		System.out.println("Duplicate elements are:");
		
	    for (int i=0; i< str.length(); i++){
	    	for(int j=0;j<str.length();j++){
	    		if (c[i]==c[j]){
	    			cnt++;
	    			break;
	    			
	    		}
	    	}
	    	
	    }
		

	}

}
