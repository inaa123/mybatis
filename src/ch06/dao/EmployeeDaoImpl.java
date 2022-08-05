package ch06.dao;

import java.util.List;

import ch06.dao.map.EmployeeMap;
import ch06.domain.Employee;
import config.Configuration;

public class EmployeeDaoImpl implements EmployeeDao {
	private EmployeeMap employeeMap;
	
	public EmployeeDaoImpl() {
		this.employeeMap = Configuration.getMapper(EmployeeMap.class);
	}
	
	@Override
	public List<Employee> selectEmployees() {
		return employeeMap.selectEmployees();
	}
}
//Employee는 도메인명이기도 하지만 업무명이기도 함.