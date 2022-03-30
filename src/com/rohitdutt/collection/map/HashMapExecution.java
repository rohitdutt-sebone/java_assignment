/**
 * 
 */
package com.rohitdutt.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * HashMapExecution
 * This class helps executing the methods written in the package
 * @author Rohitdutt Parsai
 * 22/03/2022
 */
public class HashMapExecution {
	
	ArrayList<UserData> getUserData(){
		ArrayList<UserData> list1 = new ArrayList<UserData>();
		list1.add(new UserData(101, "Rama", 20));
    	list1.add(new UserData(104, "Rohit", 24));
    	list1.add(new UserData(103, "Vivek", 21));
    	list1.add(new UserData(109, "Akash", 23));
    	list1.add(new UserData(105, "Akash", 23));
    	list1.add(new UserData(106, "Akash", 23));
    	list1.add(new UserData(102, "Ravi", 21));
    	list1.add(new UserData(108, "Akash", 23));
    	return list1;
	}

	public static void main(String[] args) {
		
		HashMapPracticeImpl hashMapPracticeImpl = new HashMapPracticeImpl();
		HashMapExecution hashMapExecution = new HashMapExecution();
		
		System.out.println("-----getUserNameByRollNumber--------");
		System.out.println(hashMapPracticeImpl.getUserNameByRollNumber(hashMapExecution.getUserData()));
		
		System.out.println("-----getUserDataMap--------");
		HashMap<Integer, UserData> hashMap1 = hashMapPracticeImpl.getUserDataMap(hashMapExecution.getUserData());
		Set<Integer> set1 = hashMap1.keySet();
		for(Integer key:set1) {
			System.out.println(hashMap1.get(key).toString());
		}
		
		System.out.println("-----findUserDataMapByName--------");
		HashMap<String,ArrayList<UserData>> hashMap2 = hashMapPracticeImpl.findUserDataMapByName(hashMapExecution.getUserData());
		Set<String> set2 = hashMap2.keySet();
		for(String key:set2) {
			System.out.println(key);
			for(UserData userData:hashMap2.get(key)) {
				System.out.println(userData);
			}
		}
		
		System.out.println("-----findUserDataListByName--------");
		ArrayList<UserData> list1 = hashMapPracticeImpl.findUserDataListByName("Akash", hashMapExecution.getUserData());
		for(UserData userData:list1) {
			System.out.println(userData);
		}
		
		System.out.println("-----updateUserAgeByName--------");
		HashMap<String,ArrayList<UserData>> hashMap3 = hashMapPracticeImpl.updateUserAgeByName("Akash",56, hashMapExecution.getUserData());
		Set<String> set3 = hashMap3.keySet();
		for(String key:set3) {
			System.out.println(key);
			for(UserData userData:hashMap3.get(key)) {
				System.out.println(userData);
			}
		}
	}

}
