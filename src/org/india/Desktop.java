package org.india;

public class Desktop extends Computer{

	public void  version(){
		System.out.println("version is 7");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.version();
		d.size();
		
	}
}
