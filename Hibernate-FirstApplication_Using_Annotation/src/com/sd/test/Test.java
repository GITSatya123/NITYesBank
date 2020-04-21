package com.sd.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sd.entities.Students;
import com.sd.helper.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) throws IOException {
		
		SessionFactory sessionFactory=null;
		Session session=null;
		Students students=null;
		Transaction transaction=null;
		boolean flag=false;
		try {
		
		sessionFactory=SessionFactoryRegistry.getSessionFactory();
		System.out.println("session factory object creatred");
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		students=new Students();
		students.setSno(987667);
		students.setSname("salman");
		students.setSadd("mumbai");
		students.setSavg(73);
		FileInputStream fis= new FileInputStream("C:\\Users\\SATYAJIT\\Desktop\\satya.jpg");
		byte[] arr=new byte[fis.available()];
		fis.read(arr);
		students.setSimg(arr);
		String s="My Name is Satyajit";
		char[] ch=s.toCharArray();
		students.setSdoc(ch);
		session.save(students);
		flag=true;
	}finally {
		if(transaction!=null) {
			if(flag) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
		}
	}
	}
}
