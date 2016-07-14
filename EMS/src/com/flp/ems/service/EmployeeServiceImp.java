package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.domain.Employee;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

//import IEmployeeService;

public class EmployeeServiceImp implements IEmployeeService{

	@Override
	public void AddEmployee(HashMap hm) {
		
		Employee e=new Employee();
		UserInteraction u=new UserInteraction();
		Validate v=new Validate();
		if(v.isvalidname(u.name)==true){
			e.setName((String)hm.get("nm"));
				}
		else{
			e.setName(null);
		}
		
			if(v.isvalidEmail(u.email)==true){
			e.setEmailid((String)hm.get("em"));
				}
		else{
			e.setEmailid(null);
		}
		
		
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
