package com.ojas.spring;

public class Student1 {
	private int sno;
	private String sname;
	private String Address;
	
	public Student1() {
		
	}

	public Student1(int sno, String sname, String address) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.Address = address;
	}

	public void display()
	{
	System.out.println(sno+"\t"+sname+"\t"+Address);
	
	}
}
