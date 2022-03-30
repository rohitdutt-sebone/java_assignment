/**
 * 
 */
package com.rohitdutt.exception.customexception;

/**
 * @author Rohitdutt Parsai
 *
 */
public class UserData  {

	private int id;
	private String name;
	private int age;
	/**
	 * 
	 */
	public UserData() {
		// TODO Auto-generated constructor stub
	}
	
	public UserData(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	
	public void setName(String name) throws InvalidNameException{
		if(name.contains("http") || name.contains("https") || name.contains("@")) {
			throw new InvalidNameException("Enter valid name");
		}else {
			this.name = name;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws AgeOutOfRangeException{
		if(age < 18) {
			throw new AgeOutOfRangeException("Age should be more than 18");
		}else {
			this.age = age;
		}
	}

	
}
