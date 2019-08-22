package org.sal;

public class A  extends B {

   public A(){
	   
		
		System.out.println("Default Constructor");
   }
   public A(int id){
	   System.out.println(id);
   }
	public static void main(String[] args) {
		
		A a= new A();
		A a1=new A(102);
       
	}

}
