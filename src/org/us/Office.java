package org.us;

import java.util.*;

public class Office {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.seteName("priya");
		e1.seteAge(25);
		
		Employee e2=new Employee();
		e2.setEid(102);
		e2.seteName("nani");
		e2.seteAge(27);
		
		l.add(e1);
		l.add(e2);	
	 for(int i=0;i<l.size();i++){
	  Employee emp=l.get(i);	 
	   System.out.println("Id:"+emp.getEid()); 
	  System.out.println("Name:"+emp.geteName());
	  System.out.println("age:"+emp.geteAge());
	 }
	}

}
