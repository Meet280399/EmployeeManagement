package com.employee.client;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.employee.models.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

public class Test {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		System.out.println("Get all the Employees");
		
		List<Employee> employeesList = employeeService.getAllEmployees();
		
		Iterator it = employeesList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Get Employee with id 100");
		Employee e = employeeService.findById(100);
		System.out.println(e);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee details to add");
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		double sal = sc.nextDouble();
		Employee edata = new Employee(id, name, dept, sal);
		boolean result = employeeService.addEmployee(edata);
		if(result == true) {
			System.out.println("Employee Added");
		}
		else {
			System.out.println("Not Added");
		}
		
		System.out.println("Printing List Again");
		List<Employee> employeesList2 = employeeService.getAllEmployees();
		Iterator it2 = employeesList2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("Enter the ID to be Deleted");
		int idDel = sc.nextInt();
		employeeService.deleteEmployee(idDel);;
		Iterator it3 = employeesList2.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		
	}
}
