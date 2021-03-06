package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject.Designation;
import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject.Employee;
import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject.EmployeeLocation;

public class EmployeeSalaryAgreegationDemo {

	public static void main(String[] args) {
		Employee employee1 = Employee.createInnerClass().createEmployee("Kingshuk Mukherjee", EmployeeLocation.CHENNAI,
				Designation.DEVELOPER, 68000.00, "03/29/2010");
		Employee employee2 = Employee.createInnerClass().createEmployee("Deeksha Banerjee", EmployeeLocation.CHICAGO,
				Designation.MANAGER, 110000.00, "04/28/2010");
		Employee employee3 = Employee.createInnerClass().createEmployee("Amit Biswas", EmployeeLocation.CHENNAI,
				Designation.MANAGER, 120000.00, "03/19/2010");
		Employee employee4 = Employee.createInnerClass().createEmployee("Mayuri Srivastava", EmployeeLocation.KOLKATA,
				Designation.DEVELOPER, 75000.00, "03/29/2012");
		Employee employee5 = Employee.createInnerClass().createEmployee("Mainak Biswas", EmployeeLocation.BANGALORE,
				Designation.TESTER, 65000.00, "03/29/2018");

		List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

		Consumer<List<Employee>> printSalary = allEmployees ->
			allEmployees.forEach(
					emp -> System.out.println("Salary of " + emp.getEmployeeName() + " is " + emp.getSalary()));

		System.out.println("Before increment.....");

		printSalary.accept(employeeList);

		Function<List<Employee>, List<Employee>> incrementSalaryFunction = employees -> {
			Double totalSalaryIncrement = 5000.00;

			Predicate<Employee> checkDeveloper = emp -> emp.getDesignation().equals(Designation.DEVELOPER);

			for (Employee employee : employeeList) {
				if (checkDeveloper.test(employee)) {
					employee.setSalary(employee.getSalary() + totalSalaryIncrement);
				}
			}

			return employees;
		};

		System.out.println("After increment.....");

		printSalary.accept(incrementSalaryFunction.apply(employeeList));
	}

}
