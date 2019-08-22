package org.us;

import java.util.Set;
import java.util.TreeSet;

public class Abc {

	
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<Integer>();
		
		s.add(105);
		s.add(205);
		s.add(305);
		s.add(405);
		s.add(505);
		s.add(605);
		s.add(705);
		s.add(805);
		for(Integer x:s)
			System.out.println( x);
		
	}

}
