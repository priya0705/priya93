package org.india;

public class CompanyInfo {

	public void getCompanyName(int cmpid){
		System.out.println("Company name is GreenTech");
	}
	public void getCompanyName(String cmpadd){
		System.out.println("Company name is MindTree");
	}
	public void getCompanyName(int cmpid,String cmpadd){
		System.out.println("Company name is cognizant");
	}
	public void getCompanyName(String cmpadd,int cmpid){
		System.out.println("company name is virtusa");
	}
			public static void main(String[] args) {
	   CompanyInfo c=new CompanyInfo();
	   c.getCompanyName(10);
       c.getCompanyName("dlf");
       c.getCompanyName("abc",05);
       c.getCompanyName(101, "dlfit");
	}

}
