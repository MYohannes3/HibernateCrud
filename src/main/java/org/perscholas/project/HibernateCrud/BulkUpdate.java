package org.perscholas.project.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.project.models.Employee;
import org.perscholas.project.utility.HibernateUtil;

public class BulkUpdate {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			
			//Begin Transactio
			ses.beginTransaction();
			
			//Update emptab set sal = sal+3000;
			ses.createQuery("UPDATE Employee SET empSal=empSal+"+2000.0).executeUpdate();
			
			//commit Transaction
			ses.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
