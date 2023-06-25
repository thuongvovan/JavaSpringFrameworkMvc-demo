package com.ivs.service;

import com.ivs.dao.GenericDao;
import com.ivs.entity.Employee;

import org.springframework.stereotype.Service;

@Service(value = "EmployeeService")
public class EmployeeService extends GenericService<Employee, String, GenericDao<Employee,String>> implements EmployeeServiceItf {

}
