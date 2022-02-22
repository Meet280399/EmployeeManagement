package com.employee.service;

import java.util.List;

import com.employee.dao.EmployeeDAO;
import com.employee.dao.EmployeeDAOimpl;
import com.employee.models.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;

	public EmployeeServiceImpl() {
		this.dao = new EmployeeDAOimpl();
	}

	@Override
	public Employee findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Employee> findByDepartment(String dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public boolean addEmployee(Employee e) {
		boolean result = dao.addEmployee(e);
		return result;
	}

	@Override
	public void deleteEmployee(int id) {
		//return dao.deleteEmployee(id);
//		return null;
		dao.deleteEmployee(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

}
