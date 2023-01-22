package org.perscholas.project.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.project.models.Employee;
import org.perscholas.project.utility.HibernateUtil;

public class RetriveWithId {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try (factory;ses){
			
			Employee emp = ses.get(Employee.class, 3);
			System.out.println("emp with id 1 info:"+emp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
