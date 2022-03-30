/**
 * 
 */
package com.rohitdutt.collection.sort;

import java.util.ArrayList;

/**
 * SortingExecution
 * This class has main method from which we can execute the sorting functionality
 * @author Rohitdutt Parsai
 * 21/03/2022
 */
public class SortingExecution {
	
	/**
	 * @param rollNumber
	 * @param age
	 * @param name
	 * @return UserData
	 * This method takes parameters like roll number, age, name and return a userData object
	 */
	public UserData getUserData(int rollNumber, int age, String name) {
		UserData userData = new UserData();
		userData.setAge(age);
		userData.setRollNumber(rollNumber);
		userData.setName(name);
		return userData;
	}

	public static void main(String[] args) {
		SortingExecution sortingExecution = new SortingExecution();
		SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		ArrayList<UserData> userDataList = new ArrayList<UserData>();
		userDataList.add(sortingExecution.getUserData(101, 20, "Rama"));
		userDataList.add(sortingExecution.getUserData(104, 24, "Rohit"));
		userDataList.add(sortingExecution.getUserData(103, 21, "Vivek"));
		userDataList.add(sortingExecution.getUserData(108, 23, "Akash"));
		userDataList.add(sortingExecution.getUserData(102, 21, "Ravi"));
		ArrayList<UserData> sortedUserDataList = sortUserDataImpl.sort(userDataList);
		for(UserData userData:sortedUserDataList) {
			System.out.println( userData.getRollNumber() + " " + userData.getAge() + " " + userData.getName());
		}
	}

}
