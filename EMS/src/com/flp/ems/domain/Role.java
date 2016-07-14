package com.flp.ems.domain;

public class Role {
	int Roleid;
	String Name;
    String Description;
	public int getRoleid() {
		return Roleid;
	}
	public void setRoleid(int roleid) {
		Roleid = roleid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
