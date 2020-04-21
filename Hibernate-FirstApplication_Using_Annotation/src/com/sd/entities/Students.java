package com.sd.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Students implements Serializable{
	@Id
	@Column(name="sno")
	protected int sno;
	@Column(name="sname")
	
	protected String sname;
	@Column(name="sadd")
	protected String sadd;
	@Column(name="savg")
	protected float savg;
	@Lob
	@Column(name="img")
	protected byte[] simg;
	@Lob
	@Column(name="doc")
	protected char[] sdoc;
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
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public float getSavg() {
		return savg;
	}
	public void setSavg(float savg) {
		this.savg = savg;
	}
	public byte[] getSimg() {
		return simg;
	}
	public void setSimg(byte[] simg) {
		this.simg = simg;
	}
	public char[] getSdoc() {
		return sdoc;
	}
	public void setSdoc(char[] sdoc) {
		this.sdoc = sdoc;
	}
	@Override
	public String toString() {
		return "Students [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", savg=" + savg + ", simg="
				+ Arrays.toString(simg) + ", sdoc=" + Arrays.toString(sdoc) + "]";
	}
	
	
		
	
}
