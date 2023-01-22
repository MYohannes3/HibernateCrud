package org.perscholas.project.HibernateCrud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.project.models.Employee;
import org.perscholas.project.utility.HibernateUtil;

public class RetriveAll {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try (factory;ses){
			
			
			//Select * from emptab
			List<Employee> list = ses.createQuery("from Employee").getResultList();
			list.forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
