package com.st.bean;

import java.util.Date;

public class Utility {

	public Date getSysDate() {
		return new Date();
	}
	public void m1() {

		System.out.println("Utility m1() method:1234");
		System.out.println("abc123");
	}
	public void m2() {
		System.out.println("Utility.m2()");
	}
//<<<<<<< HEAD
	public void m4() {
		System.out.println("Utility.m4()");
//=======
	}
	public void m3() {
//>>>>>>> stash 
		System.out.println("Utility.m3()");
	}
}
