package org.us;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Sample2 {

	
	public static void main(String[] args) {
		Map<Employee2,Integer> l= new HashMap<Employee2,Integer>();
		Employee2 e1=new Employee2();
		e1.seteName("priya");
		e1.seteId(101);
		
		Employee2 e2=new Employee2();
		e2.seteName("nani");
		e2.seteId(102);
		
		l.put(e1,25);
		l.put(e2,27);
		Set<Entry<Employee2, Integer>> e3=l.entrySet();
	    for(Entry<Employee2,Integer> x:e3){
		 Employee2 emp=x.getKey();
		 Integer emp2=x.getValue();
	   System.out.println("Name:"+emp.geteName());
	   System.out.println(("id:" +emp.geteId()));
	   System.out.println("age:"+emp2);
	 }

	}

}
