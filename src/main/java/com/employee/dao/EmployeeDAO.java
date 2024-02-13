package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	@Autowired
	EmployeeRepository empRepo;

	public String addEmployee(Employee e) {
		empRepo.save(e);

		return "Succesfully saved";
	}

	public String addEmployee1(Employee salary) {
		empRepo.save(salary);

		return "Successfully saved";
	}

	public List<Employee> getEmployee() {

		return empRepo.findAll();
	}

	public Employee getEmployee1(int id) {

		return empRepo.findById(id).get();
	}

	public String deleteEmployee(int id) {
		empRepo.deleteById(id);

		return "Deleted Successfully";
	}

	public String updateEmployee(Employee e) {
		empRepo.save(e);

		return "Updated Successfully";
	}
	
	public List<Employee> getSalary1(int sal1,int sal2) {
		return empRepo.getSalary1(sal1, sal2);
		
	}
	
	public List<Employee> getId(int id1,int id2) {
		return empRepo.getId(id1, id2);
	}
	
	public Employee getId1(int id) {
		return empRepo.findById(id).get();
	}
	
	public List<Employee> getName2(String name) {
		return empRepo.getName2(name);
	}
	
	public List<Employee> getSalary2(int salary1,int salary2) {
		return empRepo.getSalary2(salary1, salary2);
	}

}
