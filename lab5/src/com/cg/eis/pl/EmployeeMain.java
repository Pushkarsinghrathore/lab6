package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImplementation;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("\t\t\t********Enter Employee Detail********");
		System.out.println("Please Enter Id:");
		String id = scr.next();
		System.out.println("Please Enter Name:");
		String name = scr.next();
		System.out.println("Please Enter Salary:");
		String salary = scr.next();
		System.out.println("Please Enter Designation:");
		String designation = scr.next();

		Employee employee = new Employee();
		employee.setName(name);
		employee.setId(Integer.parseInt(id));
		employee.setSalary(Double.parseDouble(salary));
		employee.setDesignation(designation);

		EmployeeServiceImplementation employeeServiceImplementation = new EmployeeServiceImplementation();
		employee.setInsuranceScheme(
				employeeServiceImplementation.calculateInsuranceScheme(Double.parseDouble(salary), designation));
		employeeServiceImplementation.calculateInsuranceScheme(Double.parseDouble(salary), designation);
		System.out.println(employee);
	}

}
