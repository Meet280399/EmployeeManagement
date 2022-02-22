package com.employee.service;

import java.util.List;

import com.employee.models.Employee;

public interface EmployeeService {
	Employee findById(int id);
	List<Employee> findByDepartment(String dept);
	List<Employee> getAllEmployees();
	boolean addEmployee(Employee e);
	void deleteEmployee(int id);
	void updateEmployee(Employee e);
}
