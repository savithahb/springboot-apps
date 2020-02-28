package com.orm.run;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.model.Course;
import com.orm.model.Training;
import com.orm.utils.SessionProvider;


public class HibernateRun4 {

	public static void main (String [] args) {
		SessionFactory sf=SessionProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Training t1=new Training(1,"Ram");
		Training t2=new Training(2,"Rob");
		Training t3=new Training(3,"Roe");
	
		Course c1=new Course(1,"Java");
		Course c2=new Course(2,"C++");
		Course c3=new Course(3,"SQL");
		
		Set<Course> cset1=new HashSet<Course>();
		Set<Course> cset2=new HashSet<Course>();
		Set<Course> cset3=new HashSet<Course>();
		
		cset1.add(c1);cset1.add(c2);
		cset2.add(c1);cset2.add(c2);
		cset3.add(c1);cset3.add(c2);
		
		t1.setCourses(cset1);t1.setCourses(cset2);t1.setCourses(cset3);
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		
		t.commit();
		
		
}

}