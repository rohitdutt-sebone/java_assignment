package com.rohitdutt.collection.map;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * HashMapPracticeImpl
 * This class implements all the methods declared in HashMapPracticeInterface
 * @author Rohitdutt Parsai
 * 22/03/2022
 */
public class HashMapPracticeImpl implements HashMapPracticeInterface{
	
	/**
	 * getUserNameByRollNumber
	 * method to get HashMap based on rollNumber as key and name as value
	 * take ArrayList of UserData's as input
	 * returns a Hashmap of key: Integer and value: String
	 */
	public HashMap<Integer, String> getUserNameByRollNumber(ArrayList<UserData> list1) {
		HashMap<Integer, String> userDataMap = new HashMap<Integer, String>();
		for(UserData userData:list1) {
			userDataMap.put(userData.getRollNumber(), userData.getName());
		}
		return userDataMap;
	}
	
	/**
	 * getUserDataMap
	 * method to get HashMap based on rollNumber as key and UserData as Value
	 * take ArrayList of UserData's as input
	 * returns a Hashmap of key: Integer and value: UserData
	 */
	public HashMap<Integer, UserData> getUserDataMap(ArrayList<UserData> list1){
		HashMap<Integer, UserData> userDataMap = new HashMap<Integer, UserData>();
		for(UserData userData:list1) {
			userDataMap.put(userData.getRollNumber(), userData);
		}
		return userDataMap;
	}
	
	/**
	 * findUserDataMapByName
	 * method to get HashMap based on name as key and List of UserData as Value
	 * take ArrayList of UserData's as input
	 * returns a Hashmap of key: String and value: List of UserData
	 */
    public HashMap<String, ArrayList<UserData>> findUserDataMapByName(ArrayList<UserData> list1){
    	HashMap<String, ArrayList<UserData>> userDataMap = new HashMap<String, ArrayList<UserData>>();
		for(UserData userData:list1) {
			if(userDataMap.containsKey(userData.getName())) {
				userDataMap.get(userData.getName()).add(userData);
			}else {
				ArrayList<UserData> list2 = new ArrayList<UserData>();
				list2.add(userData);
				userDataMap.put(userData.getName(), list2);
			}
		}
    	return userDataMap;	
    }
    
    /**
	 * findUserDataListByName
	 * method to get list of UserData based on the name
	 * take ArrayList of UserData's and name of userData as input
	 * returns a ArrayList of UserData
	 */
	public ArrayList<UserData> findUserDataListByName(String name, ArrayList<UserData> list1) {
    	HashMap<String, ArrayList<UserData>> userDataMap = new HashMap<String, ArrayList<UserData>>();
    	for(UserData userData:list1) {
			if(userDataMap.containsKey(userData.getName())) {
				userDataMap.get(userData.getName()).add(userData);
			}else {
				ArrayList<UserData> list2 = new ArrayList<UserData>();
				list2.add(userData);
				userDataMap.put(userData.getName(), list2);
			}
		}
		return userDataMap.get(name);
	}

	/**
	 * updateUserAgeByName
	 * method to change age of UserData based on given name  
	 * take ArrayList of UserData's, name of UserData and age of UserData as input
	 * returns a Hashmap of key: String and value: List of UserData
	 */
	public HashMap<String, ArrayList<UserData>> updateUserAgeByName(String name, int age, ArrayList<UserData> list1) {
		HashMap<String, ArrayList<UserData>> userDataMap = new HashMap<String, ArrayList<UserData>>();
    	for(UserData userData:list1) {
			if(userDataMap.containsKey(userData.getName())) {
				userDataMap.get(userData.getName()).add(userData);
			}else {
				ArrayList<UserData> list2 = new ArrayList<UserData>();
				list2.add(userData);
				userDataMap.put(userData.getName(), list2);
			}
		}
    	for(UserData userData:userDataMap.get(name)) {
    		userData.setAge(age);
    	}
		return userDataMap;
	}
}
