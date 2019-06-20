package com.employee.dao;

import java.util.List;  
import com.employee.domain.Employee;  

public interface EmployeeDataDAO {

	public int insertRow(Employee employee);  

	public List<Employee> getList();  

	public Employee getRowById(int id);  

	public int updateRow(Employee employee);  

	public int deleteRow(int id);  

}  