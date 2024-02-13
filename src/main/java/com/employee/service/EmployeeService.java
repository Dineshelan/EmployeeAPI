package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDAO;
import com.employee.entity.Employee;
import com.employee.exception.NameNotFoundException;
import com.employee.exception.SalaryException;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO empDao;

	public String addEmployee(Employee e) {

		return empDao.addEmployee(e);
	}

	public String addEmployee1(Employee salary) throws SalaryException {
		try {
			if (salary.getSalary() > 25000) {
				throw new SalaryException("Salary not Found");
			} else {
				return empDao.addEmployee1(salary);
			}
		} catch (Exception ex) {
			return "Exception Handled";
		}
	}

	public List<Employee> getEmployee() {

		return empDao.getEmployee();
	}

	public Employee getEmployee1(int id) {

		return empDao.getEmployee1(id);
	}

	public String deleteEmployee(int id) {

		return empDao.deleteEmployee(id);
	}

	public String updateEmployee(Employee e) {

		return empDao.updateEmployee(e);
	}

	public List<Employee> getSalary(int salary) {
		List<Employee> allEmployee = this.getEmployee();
		return allEmployee.stream().filter(x -> x.getSalary() > salary).toList();

	}

	public Employee getMaxSalary() {
		List<Employee> allEmployee = this.getEmployee();
		return allEmployee.stream().max(Comparator.comparingInt(Employee::getSalary)).get();

	}

	public Employee getMinSalary() {
		List<Employee> allEmployee = this.getEmployee();
		return allEmployee.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
	}

	public List<Employee> getHike(String desigination) {
		List<Employee> allEmployee = this.getEmployee();
		return allEmployee.stream().filter(x -> x.getDesigination().equalsIgnoreCase(desigination))
				.peek(x -> x.setSalary((x.getSalary() * 5 / 100) + x.getSalary())).collect(Collectors.toList());
	}

	public List<Employee> getName1(String name) throws NameNotFoundException {
		List<Employee> allEmployee = this.getEmployee();
		List<Employee> temp = allEmployee.stream().filter(x -> x.getName().contains(name)).collect(Collectors.toList());
		if (temp.isEmpty()) {
			throw new NameNotFoundException("Name not Found");
		} else {
			return temp;
		}
	}

	public List<String> getGender(String gender) {
		List<Employee> allEmployee = this.getEmployee();

		return allEmployee.stream().filter(x -> x.getGender().equalsIgnoreCase(gender)).map(x -> x.getName())
				.collect(Collectors.toList());
	}

	public List<Integer> getDesigination(String desigination) {
		List<Employee> allEmployee = this.getEmployee();
		return allEmployee.stream().filter(x -> x.getDesigination().contains(desigination)).map(x -> x.getSalary())
				.collect(Collectors.toList());
	}

	public List<Employee> getSalary1(int sal1, int sal2) {
		return empDao.getSalary1(sal1, sal2);
	}

	public List<Employee> getId(int id1, int id2) {
		return empDao.getId(id1, id2);
	}

	public Employee getId1(int id) {
		return empDao.getId1(id);
	}
	
	public List<Employee> getName2(String name) throws NameNotFoundException {
		if(empDao.getName2(name).isEmpty()) {
			throw new NameNotFoundException("Name not found");
		}
		else {
			return empDao.getName2(name);
		}
	}
	
	public List<Employee> getSalary2(int salary1,int salary2) throws SalaryException {
		if(empDao.getSalary2(salary1,salary2).isEmpty()) {
			throw new SalaryException("Salary does not exist");
		}
		else {
			return empDao.getSalary2(salary1,salary2);
		}
	}
}
