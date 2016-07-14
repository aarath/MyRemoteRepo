package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

public class EmployeeDaoImplForList implements IemployeeDao{
	

	List<Object> elist = new ArrayList<Object>();

	

	@Override
	public void AddEmployee(Employee e){
		// TODO Auto-generated method stub
		
		
		elist.add(e);
		System.out.println(elist);
		
		
		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}

