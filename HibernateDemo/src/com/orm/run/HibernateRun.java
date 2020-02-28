package com.orm.run;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.orm.model.Person;
import com.orm.utils.SessionProvider;


public class HibernateRun {

	public static void main(String [] args) {
		SessionFactory sf=SessionProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction t= session.beginTransaction();
			/*Person p= new Person(5, "GitaK", "Delhi");
			session.saveOrUpdate(p);
			p= new Person(2, "Krishna", "Bengaluru");
			session.saveOrUpdate(p);
			Person p= new Person(6, "Savitha", "Hassan");
			session.delete(p);*/
			//Query q= session.createQuery("from Person where city like'D%'");
		Criteria q=session.createCriteria(Person.class);
		//Criterion c1=Restrictions.like("name","G%");
		//q.add(c1);
		Order o=Order.asc("name");
		q.addOrder(o);
			List<Person> list=q.list();
			for (Person x: list) {
				System.out.println(x.getName()+" "+x.getCity());
			}
			//t.commit();
		//System.out.println("New records added");
			
	}
}
