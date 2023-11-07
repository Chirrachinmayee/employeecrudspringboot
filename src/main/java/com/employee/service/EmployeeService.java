package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;

public interface EmployeeService
{
Employee createEmployee(Employee employee);//Create
List<Employee> getAllEmployee();//Read
Optional<Employee> getEmployeee(int id);
Employee updateEmployee(int Id,Employee employee);//Update
void deleteEmployee(int id);//Delete
Employee getbyid(int id);




}
