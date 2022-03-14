
package SpringCoreAutowireAtc.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("SpringCoreAutowireAtc.com.springcore")
public class Test {
public static void main(String[] args) {
	
	
	//Employee emp= new Employee(123, "bansal", 78203, "jaipur");
	
//	Resource resource = new ClassPathResource("springConfig.xml");
//	
//	BeanFactory factory= new XmlBeanFactory(resource);
	
	//ApplicationContext factory= new ClassPathXmlApplicationContext("springConfig.xml");
	
	ApplicationContext factory= new AnnotationConfigApplicationContext(Test.class);
	
	  
//	  emp.setEmpid(124);
//	  emp.setEmpname("kushi");
//	  
//	
//	  Address add =(Address) factory.getBean("address");
//	  add.setColony("jaipur");
//	  emp.setAddress(add);
  
	Employee emp =(Employee) factory.getBean("employee");
	emp.setEmpid(007);
	emp.setEmpname("james b");
	emp.setEmpsal(90000);
	
	Address add1 =(Address) factory.getBean("address");
	add1.setColony("saraswati");
	emp.setAddress(add1);
	  System.out.println(emp); //beanscope : singletone, prototype
	
	 
	  
}
}