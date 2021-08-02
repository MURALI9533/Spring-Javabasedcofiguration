

package com.adi.service;

import com.adi.dao.EmployeeDAO;
import javax.annotation.PreDestroy;

public class EmployeeService {
	private EmployeeDAO employeedao;

	public EmployeeDAO getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(EmployeeDAO employeedao) {
		this.employeedao = employeedao;
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("EmployeeDAO destroyMethod");
	}

}
