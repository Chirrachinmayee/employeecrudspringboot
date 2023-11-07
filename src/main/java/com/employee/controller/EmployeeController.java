package com.employee.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/empdata")
@CrossOrigin(origins = {"http://localhost:5173"})

public class EmployeeController 
{
	
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/create")
	public Employee createEmpoyee(@RequestBody Employee employee)
	{
		System.out.println("one-c");
		return employeeService.createEmployee(employee);
	}
	@GetMapping("/getById{id}")
	public Employee getEmpId(@PathVariable ("id") int id) {
		return employeeService.getbyid(id);
	}
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployees(){
	List<Employee> empList=employeeService.getAllEmployee();
	if(empList !=null && !empList.isEmpty())
	{
		return empList;
	}
	else
	{
	
	return Collections.emptyList();
	}
	}
	@DeleteMapping("/deleteEmp{id}")
	public void deleteEmployee(@PathVariable ("id") int id)
	{
		employeeService.deleteEmployee(id);
	}
}
