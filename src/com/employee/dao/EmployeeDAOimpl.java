package com.employee.dao;

import java.util.List;

import com.employee.models.Employee;

public class EmployeeDAOimpl implements EmployeeDAO {
	private DataStore store = new DataStore();

	@Override
	public Employee findById(Integer id) {
		Employee employee = null;
		for (Employee e1 : store.getEmployees()) {
			if (e1.getId() == id) {
				employee = e1;
				break;
			}
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return store.getEmployees();
	}

	@Override
	public boolean addEmployee(Employee e) {
		if (store.setEmployee(e))
			return true;
		else
			return false;
	}

	@Override
	public void deleteEmployee(int id) {
		store.deleteEmployee(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

}
