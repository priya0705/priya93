package org.us;


import java.util.*;
import java.util.Map.Entry;

public class Sample {

		public static void main(String[] args) {

		Map<String,Integer> s= new HashMap<String,Integer>();
		s.put("priya",25);
		s.put("nani", 27);
		s.put("priya",27);
		s.put("java", 30);
		//to obtain only key values below method is used
		Set<String> e=s.keySet();
		//to obtain only values below method is used
		Collection<Integer>e1 =s.values();
		//to obtain only all entries one by one below method is used
		Set<Entry<String,Integer>> e3=s.entrySet();
		for(String x:e){
			System.out.println(x);
		}
		for(Integer x:e1){
			System.out.println(x);
		}
		for(Entry<String,Integer> x:e3){
			System.out.println(x);
			
		}
		
	}

}
