package org.us;

import java.util.*;

public class Good {

	public static void main(String[] args) {
	//using HashSet
	Set<String> s=new HashSet<String>();
	//using TreeSet
	Set<Integer> s1=new TreeSet<Integer>();
	s.add("priya");
	s.add("nani");
	s1.add(25);
	s1.add(27);
	for(String i:s){
		System.out.println(i);
	}
   for(Integer i:s1){
	   System.out.println(i);
   }
   //conversion to List
   List<String> l=new  ArrayList<String>();
   for(int i=0;i<l.size();i++){
	   System.out.println(l.get(i));
   }
	}
}
