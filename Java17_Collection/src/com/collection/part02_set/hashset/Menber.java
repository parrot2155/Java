package com.collection.part02_set.hashset;

import java.util.Objects;

public class Menber {
	 private String name;
	 private int age;
	 private String phone;
	 
	 public Menber() {}

	public Menber(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return "Menber [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menber other = (Menber) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	 
}
