package com.employee.services;

import java.util.List;

import com.employee.domain.Employee;

public interface EmployeeDataService {

	public int insertRow(Employee employee);
	

	public List<Employee> getList() ;

	public int deleteRow(int id) ;

	public Employee getRowById(int id) ;

	public int updateRow(Employee employee);
	
}
