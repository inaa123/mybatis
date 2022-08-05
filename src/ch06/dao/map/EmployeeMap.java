package ch06.dao.map;

import java.util.List;

import ch06.domain.Employee;

public interface EmployeeMap {
	List<Employee> selectEmployees(); //사원 목록 읽어오기
	
}
