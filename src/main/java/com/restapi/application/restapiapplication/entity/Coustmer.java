package com.restapi.application.restapiapplication.entity;

public class Coustmer {

	private int id;
	private String name;
	private String gender;
	private int age;
	private String prefFood;
	
	
	
	
	public Coustmer(int id, String name, String gender, int age, String prefFood) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.prefFood = prefFood;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPrefFood() {
		return prefFood;
	}
	public void setPrefFood(String prefFood) {
		this.prefFood = prefFood;
	}
	@Override
	public String toString() {
		return "Coustmer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", prefFood="
				+ prefFood + "]";
	}
	
	
	
	
}
