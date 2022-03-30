package com.rohitdutt.collection.sort;

/**
 * UserData
 * This class is a entity for user related data
 * @author Rohitdutt Parsai
 * 21/03/2022
 */
public class UserData {
	private int rollNumber;
	private String name;
	private int age;
	
	public UserData() {
		
	}

	public UserData(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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
	
}
