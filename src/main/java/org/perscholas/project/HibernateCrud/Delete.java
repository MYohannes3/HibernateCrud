package org.perscholas.project.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.project.models.Employee;
import org.perscholas.project.utility.HibernateUtil;

public class Delete {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			
			//Begin Transaction
			ses.beginTransaction();
			
			//gets the emp
			Employee emp = ses.get(Employee.class, 4);
			
			//delete emp
			ses.delete(emp);
			//commit Transaction
			ses.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}