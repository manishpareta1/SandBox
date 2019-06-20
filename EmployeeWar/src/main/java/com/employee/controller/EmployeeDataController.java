package com.employee.controller;


import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  

import com.employee.domain.Employee;  
import com.employee.services.EmployeeDataService;  

@Controller  
public class EmployeeDataController {

	@Autowired  
	EmployeeDataService dataService;  

	@RequestMapping("form")  
	public ModelAndView getForm(@ModelAttribute Employee employee) {  
		return new ModelAndView("form");  
	}  

	@RequestMapping("register")  
	public ModelAndView registerUser(@ModelAttribute Employee employee) {  
		dataService.insertRow(employee);  
		return new ModelAndView("redirect:list");  
	}  

	@RequestMapping("list")  
	public ModelAndView getList() {  
		List employeeList = dataService.getList();  
		return new ModelAndView("list", "employeeList", employeeList);  
	}  

	@RequestMapping("delete")  
	public ModelAndView deleteUser(@RequestParam int id) {  
		dataService.deleteRow(id);  
		return new ModelAndView("redirect:list");  
	}  

	@RequestMapping("edit")  
	public ModelAndView editUser(@RequestParam int id,  
			@ModelAttribute Employee employee) {  
		Employee employeeObject = dataService.getRowById(id);  
		return new ModelAndView("edit", "employeeObject", employeeObject);  
	}  

	@RequestMapping("update")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	public ModelAndView updateUser(@ModelAttribute Employee employee) { 
		System.out.println("employee.id: "+employee.getId());
		dataService.updateRow(employee);  
		return new ModelAndView("redirect:list");  
	}  

}                              
