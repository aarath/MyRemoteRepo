package com.flp.ems.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.util.Validate;


public class UserInteraction {
	
	public String name;
	public String kin;
	public String email;
	public int fon;
	public String dob;
	public String doj;
	
	HashMap me=new HashMap();
	 Scanner sc=new Scanner(System.in);
	 void AddEmployee(){
		 
		 System.out.println("Enter the number of Employee details u want to enter");
		 int n=sc.nextInt();
		 for(int i=0;i<=n;i++){
		Employee e=new Employee();
		Project p=new Project();
		Department d=new Department();
		Role r=new Role();
		
		System.out.println("Enter the Employee name:");
		 name=sc.next();
		
		System.out.println("Enter the KIN_ID");
		 kin=sc.next();
		
		System.out.println("Enter the Email_ID");
		 email=sc.next();
		
		System.out.println("Enter the Phone_No");
		 fon=sc.nextInt();
		
		System.out.println("Enter the Date of Birth of the Employee");
		 dob=sc.next();
		Validate v=new Validate();
		v.isvalidDate(dob);
	
		
		System.out.println("Enter the Date of Joining of the Employee");
		 doj=sc.next();
		Validate v1=new Validate();
		v.isvalidDate(doj);
		
		d.setDeptname("development");
		d.setDepartmentid(34);
		d.setDesc("drgfdfhgfh");
		p.setName("cloud");
		p.setProjectid(5);
		r.setName("developer");
		r.setRoleid(56788);
		
		
		 String d1 = String.valueOf(e.getDepartmentid());
		 String p1 = String.valueOf(e.getProjectid());
		 String r1 = String.valueOf(e.getRoleid());
		 me.put("nm",name);
		 me.put("kinid",kin);
		 me.put("emailid",email);
		 me.put("dateB",dob);
		 me.put("dateJ",doj);
		 me.put("Deprt",d1);
		 me.put("Proj",p1);
		 me.put("Role",r1);
		 System.out.println(me);
	
		 }
		}
		void ModifyEmployee(){
			
		}
		void RemoveEmployee(){
			
		}
		void SearchEmployee(){
			
		}
		void getAllEmployee(){
			
			
		}
		
}
