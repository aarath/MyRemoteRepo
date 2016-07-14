package com.flp.ems.domain;

public class Project {
	int Projectid;
    String name;
	String Description;
	int Departmentid;
	public int getProjectid() {
		return Projectid;
	}
	public void setProjectid(int projectid) {
		Projectid = projectid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getDepartmentid() {
		return Departmentid;
	}
	public void setDepartmentid(int departmentid) {
		Departmentid = departmentid;
	}
}
