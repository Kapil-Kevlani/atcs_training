package net.javaguides.postgresql;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sathya");
		
		EntityManager entity=factory.createEntityManager(); 
		
		//persist()-->save or insert, merge()-->update, remove()-->delte, find()==>selct fetch
		
		Employee emp= new Employee(123, "soma", 1000, "hyd");
		
		entity.getTransaction().begin();
		
		entity.persist(emp);
		
		//Employee emp=entity.find(Employee.class, 123);
		//System.out.println(emp); 
		
//		emp.setEmpAdd("maharastra");
//		emp.setEmpname("ragu");
//		emp.setEmpsal(780000);
		
		//entity.merge(emp);
		//entity.remove(emp);
		
		
		entity.getTransaction().commit();
		
	}

}


