package com.hefshine.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hb_person")

public class Person {

	@Id
	@Column(name = "Age")
	private int age;
	
	
	@Column(name = "F_name")
	private String F_name;


	@Column(name = "L_name")
	private String L_name;

	
	@Column(name = "Address")
	private String Address;

	public Person() {

	}

	public Person(int age, String f_name, String l_name, String address) {
		super();
		this.age = age;
		F_name = f_name;
		L_name = l_name;
		Address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getF_name() {
		return F_name;
	}

	public void setF_name(String f_name) {
		F_name = f_name;
	}

	public String getL_name() {
		return L_name;
	}

	public void setL_name(String l_name) {
		L_name = l_name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", F_name=" + F_name + ", L_name=" + L_name + ", Address=" + Address + "]";
	}
}
