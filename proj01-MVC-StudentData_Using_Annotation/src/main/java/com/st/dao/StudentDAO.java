package com.st.dao;

import java.io.Serializable;

public class StudentDAO implements Serializable {

	private int sno;
	private String sname;
	private String address;
	private int marks;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDAO [sno=" + sno + ", sname=" + sname + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
	
}
