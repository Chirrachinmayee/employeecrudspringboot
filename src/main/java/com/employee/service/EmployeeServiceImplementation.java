package com.employee.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	

	@Override
	public List<Employee> getAllEmployee() 
	{
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeee(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Employee updateEmployee(int Id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
	    employeeRepository.deleteById(id);
	}
	@Override
	public Employee getbyid(int id) {
		return employeeRepository.findById(id).get();
	}

	
}
