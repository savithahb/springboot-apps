package com.orm.run;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.orm.model.Dept;
import com.orm.model.Emp;
import com.orm.utils.SessionProvider;

public class HibernateRun2 {

	public static void main (String [] args) {
	SessionFactory sf=SessionProvider.getSessionFactory();
	Session session=sf.openSession();
	//Transaction t=session.beginTransaction();
		
	Query q=session.createQuery("from Dept");
	List<Dept> list=q.list();
	for(Dept d:list) {
		System.out.println(d.getName());
		System.out.println("-----------------------------");
		for (Emp x:d.getEmployees()) {
			System.out.println(x.getName()+" " +x.getCity());
		}
	}
	
	/*Dept d=new Dept(1, "Production");
	Emp e1= new Emp(1,"Naveen", "Chennai","Manager");
	Emp e2= new Emp(2,"Ram", "Chennai","Clerk");
	Emp e3= new Emp(3,"Jessica", "Lucknow","Accountant");
	
	e1.setDepartment(d);
	e2.setDepartment(d);
	e3.setDepartment(d);
	
	Set<Emp> set=new HashSet<Emp> ();
	set.add(e1);
	set.add(e2);
	set.add(e3);
	
	d.setEmployees(set);*/
	
	//session.save(d);
	//t.commit();
	
	}	
	
}
