package com.adi.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.adi.bpp.SomeBpp;
import com.adi.dao.EmployeeDAO;
import com.adi.dao.jpa.JpaEmployeeDAO;
import com.adi.service.DepartmentService;
import com.adi.service.EmployeeService;

@Configuration
@ComponentScan("com.adi")
public class AppConfig {
	@Bean
	public EmployeeService myEmployeeService() {
		EmployeeService service=new EmployeeService();
		service.setEmployeedao(myJpaEmployeeDao());
		return service;
	}
	@Bean
	public DepartmentService myDepartmentService() {
		DepartmentService service=new DepartmentService();
		service.setEmployeedao(myJpaEmployeeDao());
		return service;
	}
	@Bean
	public EmployeeDAO myJpaEmployeeDao() {
		// TODO Auto-generated method stub
		return new JpaEmployeeDAO();
	}
	@Bean
	public SomeBpp mySomeBpp() {
		return new SomeBpp();
	}

}
