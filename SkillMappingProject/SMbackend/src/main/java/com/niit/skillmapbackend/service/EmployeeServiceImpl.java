package com.niit.skillmapbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.skillmapbackend.DAO.EmployeeDAO;
import com.niit.skillmapbackend.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  private EmployeeDAO employeeDAO;
  @Override
	public boolean addEmployee(Employee employee) {
		if(employeeDAO.listById(employee.getEmpId())!=null) {
			return false;
		}
		else {
			employeeDAO.add(employee);
			return true;
		}

	}
  @Override
	public boolean updateEmployee(Employee employee) {
		if(employeeDAO.listById(employee.getEmpId())!=null) {	
			employeeDAO.update(employee);
			return true;
		}
		else {
			return false;
		}

	}
  
  
  @Override
	public Employee listEmployeeById(int empId) {
		return employeeDAO.listById(empId);

	}
  @Override
	public List<Employee> listAllEmployees() {
		return employeeDAO.listAll();

	}
  @Override
	public boolean deleteEmployee(int empId) {
		if(employeeDAO.listById(empId)!=null) {	
			employeeDAO.delete(empId);
			return true;
		}
		else {
			return false;
		}

	
	}
  @Override
	public Employee listEmployeeByEmailId(String email) {
		
		return employeeDAO.listByEmailId(email);
	}

	

	
	

}
