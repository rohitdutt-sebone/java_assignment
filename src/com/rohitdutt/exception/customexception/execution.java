package com.rohitdutt.exception.customexception;

public class execution {

	public execution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserData userData = new UserData();
		try {
			userData.setId(101);
			userData.setName("test@test");
			userData.setAge(10);
		}catch(AgeOutOfRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(InvalidNameException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
