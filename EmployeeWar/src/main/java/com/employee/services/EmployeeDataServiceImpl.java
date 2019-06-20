package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.dao.EmployeeDataDAO;
import com.employee.domain.Employee;

public class EmployeeDataServiceImpl implements EmployeeDataService {  

	@Autowired  
	EmployeeDataDAO dataDao;  

	public int insertRow(Employee employee) {  
		return dataDao.insertRow(employee);  
	}  

	
	public List<Employee> getList() {  
		return dataDao.getList();  
	}  


	public Employee getRowById(int id) {  
		return dataDao.getRowById(id);  
	}  


	public int updateRow(Employee employee) {  
		return dataDao.updateRow(employee);  
	}  


	public int deleteRow(int id) {  
		return dataDao.deleteRow(id);  
	}  

}  