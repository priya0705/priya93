package org.us;

import java.util.*;

public class Well {

	
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
	
	Set<Integer> s=new TreeSet<Integer>();
	
	s.add(50);
	s.add(60);
	s.add(70);
	s.add(80);
	
			
		s.addAll(l);
		System.out.println("number:"+s);	
	}

}
