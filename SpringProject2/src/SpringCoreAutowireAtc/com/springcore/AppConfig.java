package SpringCoreAutowireAtc.com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class AppConfig { 
	
	
	
		@Bean("empp")
		public Employee getEmployee() {
			Employee emp= new Employee();
			emp.setEmpid(120);
			emp.setEmpname("juned");
			return emp;
		}
		
		@Bean("add")
		public Address getAddress() {
			Address add= new Address();
			add.setHonum(150);
			add.setColony("maharajganj");
			return add;
		
	}

}
