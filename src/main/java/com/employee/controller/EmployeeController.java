package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.NameNotFoundException;
import com.employee.exception.SalaryException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empSer;

	@PostMapping(value = "/post")
	public String addEmployee(@RequestBody Employee e) {

		return empSer.addEmployee(e);
	}

	@PostMapping(value = "/postAll")
	public String addEmployee1(@RequestBody Employee salary) throws SalaryException {

		return empSer.addEmployee1(salary);
	}

	@GetMapping(value = "/getEmployee")
	public List<Employee> getEmployee() {

		return empSer.getEmployee();
	}

	@GetMapping(value = "/getSingleDetail/{id}")
	public Employee getEmployee1(@PathVariable int id) {

		return empSer.getEmployee1(id);
	}

	@DeleteMapping(value = "/deleteSingleData/{id}")
	public String deleteEmployee(@PathVariable int id) {

		return empSer.deleteEmployee(id);
	}

	@PutMapping(value = "/updateData")
	public String updateEmployee(@RequestBody Employee e) {

		return empSer.updateEmployee(e);
	}

	@GetMapping(value = "/getSalary/{salary}")
	public List<Employee> getSalary(@PathVariable int salary) {

		return empSer.getSalary(salary);
	}

	@GetMapping(value = "/maxSalary")
	public Employee getMaxSalary() {
		
		return empSer.getMaxSalary();
	}

	@GetMapping(value ="/minSalary")
	public Employee getMinSalary() {
		return empSer.getMinSalary();
	}
	
	@GetMapping(value ="/hikeSalary/{desigination}")
	public List<Employee> getHike(@PathVariable String desigination) {
		return empSer.getHike(desigination);
	}
	
	//@GetMapping(value = "/getName/{name}")
	//public List<Employee> getName(@PathVariable String name) {
		//return empSer.getName(name);
	//}
	
	@GetMapping(value = "/getGender/{gender}")
	public List<String> getGender(@PathVariable String gender) {
		return empSer.getGender(gender);
	}
	
	@GetMapping(value = "/getDesigination/{desigination}")
	public List<Integer> getDesigination(@PathVariable String desigination) {
		return empSer.getDesigination(desigination);
	}
	
	@GetMapping(value = "/getSalary1/{sal1}/{sal2}")
	public List<Employee> getSalary1(@PathVariable int sal1,@PathVariable int sal2) {
		return empSer.getSalary1(sal1,sal2);
	}
	
	@GetMapping(value ="/getId/{id1}/{id2}")
	public List<Employee> getId(@PathVariable int id1,@PathVariable int id2) {
		return empSer.getId(id1,id2);
	}
	
	@GetMapping(value = "/getName1/{name}")
	public List<Employee> getName1(@PathVariable String name) throws NameNotFoundException {
		
		return empSer.getName1(name);
	}
	
	@GetMapping(value = "getId1/{id}")
	public Employee getId1(@PathVariable int id) {
		 
		return empSer.getId1(id);
	}
	
	@GetMapping(value = "getName2/{name}")
	public List<Employee> getName2(@PathVariable String name) throws NameNotFoundException {
		
		return empSer.getName2(name);
	}
	@GetMapping(value = "getSalary2/{salary1}/{salary2}")
	public List<Employee> getSalary2(@PathVariable int salary1,@PathVariable int salary2) throws SalaryException {
		
		return empSer.getSalary2(salary1,salary2);
	}
	
}
