package com.flp.ems.domain;

import com.flp.ems.util.Validate;

public class Employee {
	String name;
	String kinid; 
	String emailid; 
	String Phoneno; 
	String address;
	String dob; 
	String doj;
    String departmentid; 
	String projectid; 
	String roleid;
	Validate v=new Validate();
	//int count=1;
	/*Scanner sc=new Scanner(System.in);
	{
		System.out.println("enter no. of employees::");
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
			System.out.println("Generated employee id is::"+count);
		}
	}*/
	public String getName() {
		System.out.println("It is validated"+v.isvalidname(name));
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinid() {
		return kinid;
	}
	public void setKinid(String kinid) {
		this.kinid = kinid;
	}
	public String getEmailid() {
		System.out.println("It is validated"+v.isvalidEmail(emailid));
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneno() {
		System.out.println("It is validated"+v.isvalidPhone(Phoneno));
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		System.out.println("It is validated"+v.isvalidDate("01"));
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		System.out.println("It is validated"+v.isvalidDate("30"));
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDepartmentid() {
		System.out.println("It is validated"+v.isInt(departmentid));
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public String getProjectid() {
		System.out.println("It is validated"+v.isInt(projectid));
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getRoleid() {
		System.out.println("It is validated"+v.isInt(roleid));
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}}
	/*public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}*/
	/*public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
   // int n=sc.nextInt();
	/*{
	System.out.println("Enter Employee name::");
	String name=sc.next();
	}
	{
	System.out.println("Enter kinid::");
	String kinid=sc.next();
	}
	{
		System.out.println("Enter emailid::");
		String emailid=sc.next();
		}
	{
		System.out.println("Enter phoneno::");
		int phoneno=sc.nextInt();
		}
	{
		System.out.println("Enter address::");
		String address=sc.next();
		}
	{
		System.out.println("Enter dob::");
		int dob=sc.nextInt();
		}
	{
		System.out.println("Enter doj::");
		int doj=sc.nextInt();
		}
	{
		System.out.println("Enter departmentid::");
		int departmenidt=sc.nextInt();
		}
	{
		System.out.println("Enter projectid::");
		int projectid=sc.nextInt();
		}
	{
		System.out.println("Enter roleid::");
		int roleid=sc.nextInt();
		}
}*/
	
	
	

