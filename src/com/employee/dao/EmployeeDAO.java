package com.employee.dao;

import java.util.List;

import com.employee.models.Employee;


public interface EmployeeDAO {
	Employee findById(Integer id);
	List<Employee> getAllEmployees();
	boolean addEmployee(Employee e);
	void deleteEmployee(int id);
	void updateEmployee(Employee e);
}
