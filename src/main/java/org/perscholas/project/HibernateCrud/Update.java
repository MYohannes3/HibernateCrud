package org.perscholas.project.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.project.models.Employee;
import org.perscholas.project.utility.HibernateUtil;

public class Update {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			
			//Begin Transaction
			ses.beginTransaction();
			
			//get the emp with id 2
			Employee emp = ses.get(Employee.class, 2);
		
			//set the value to 50000.0
			emp.setEmpSal(50000.0);
			
			//commit Transaction
			ses.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}