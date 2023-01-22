package org.perscholas.project.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.project.models.Employee;
import org.perscholas.project.utility.HibernateUtil;

public class Insert {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		try(factory;ses){
			
			//Begin  Transaction
			ses.beginTransaction();
			
			//Create emp obj
			Employee emp=new Employee("Meseret", "Yohannes", 3000.0);
			Employee emp1=new Employee("Chuchu", "Meklit", 13000.0);
			Employee emp2=new Employee("Galila", "Mama", 23000.0);
			Employee emp3=new Employee("Dagi", "Yohannes", 33000.0);
			Employee emp4=new Employee("Bethel", "Mimi", 43000.0);
			
			//save
			ses.persist(emp);
			ses.persist(emp1);
			ses.persist(emp2);
			ses.persist(emp3);
			ses.persist(emp4);
			
			
			ses.flush();
		
			//commit Transaction
			ses.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
