package com.rohitdutt.collection.map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * HashMapPracticeInterface
 * Interface for Practicing hashmaps, Methods written here should be implemented
 * @author Rohitdutt Parsai
 * 22/03/2022
 */
public interface HashMapPracticeInterface {
	
	HashMap<Integer, String> getUserNameByRollNumber(ArrayList<UserData> list1);
		
	HashMap<Integer, UserData> getUserDataMap(ArrayList<UserData> list1);
    
	HashMap<String, ArrayList<UserData>> findUserDataMapByName(ArrayList<UserData> list1);
    
	ArrayList<UserData> findUserDataListByName(String name, ArrayList<UserData> list1);
	
    HashMap<String, ArrayList<UserData>> updateUserAgeByName(String name, int age,ArrayList<UserData> list1);   
}
