package com.employee.dao;

import java.util.ArrayList;
import java.util.List;

import com.employee.models.Employee;

public class DataStore {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	DataStore() {
		System.out.println("Initializing Data Store ....");
		Employee employee1 = new Employee(100, "Meet", "Developer", 75000f);
		Employee employee2 = new Employee(101, "Sameeksha", "Developer", 50000f);

		employees.add(employee1);
		employees.add(employee2);

	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public boolean setEmployee(Employee e) {
		employees.add(e);
		return true;
	}

	public void deleteEmployee(int id) {
		if (id == Employee.getId()) {
			employees.remove(id);
		}
		System.out.println(employees);
		//return employees;
	}
}
