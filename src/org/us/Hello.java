package org.us;

import java.util.*;

public class Hello {

	
	public static void main(String[] args) {
		//  using ArrayList 
		List<Integer>a=new ArrayList<Integer>();
		//using LinkedList
		List<Integer> l=new LinkedList<Integer>();
		l.add(101);
		l.add(102);
		l.add(102);
		a.add(25);
		a.add(27);
		//normal for loop
		for(int i=0;i<l.size();i++){
			
		System.out.println(l.get(i));
		
	}
		//enhanced for loop
		for(Integer i:a){
			System.out.println(i);
		}
		System.out.println(l.get(2));
		System.out.println(l.size());
	}
}
