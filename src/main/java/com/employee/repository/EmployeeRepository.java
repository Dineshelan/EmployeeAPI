package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
	
	@Query(value="Select * from employees_detail where salary>=? and salary<=?", nativeQuery = true)
	
	public List<Employee> getSalary1(int sal1,int sal2);
	
	@Query(value="Select e from Employee e where e.id>=:id1 and e.id<=:id2")
	
	public List<Employee> getId(@Param(value="id1") int id1,@Param(value="id2")int id2);
	
	@Query(value ="Select * from employees_detail where name like ?", nativeQuery = true)
	
	public List<Employee> getName2(String name);
	
	@Query(value = "Select * from employees_detail where salary>=? and salary<=?", nativeQuery = true)
	
	public List<Employee> getSalary2(int salary1,int salary2); 

}
