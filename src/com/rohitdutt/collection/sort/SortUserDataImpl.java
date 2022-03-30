/**
 * 
 */
package com.rohitdutt.collection.sort;

import java.util.*;

/**
 * SortUserDataImpl
 * This class provides implementation of sort method from SortUserData interface
 * @author Rohitdutt Parsai
 * 21/03/2022
 */
public class SortUserDataImpl implements SortUserData{
	
	public ArrayList<UserData> sort(ArrayList<UserData> userDataList){
		for(int i = 0; i < userDataList.size(); i++) {
			for(int j = i; j < userDataList.size(); j++) {
				if(userDataList.get(i).getRollNumber() > userDataList.get(j).getRollNumber()) {
					UserData tempUserData = userDataList.get(j);
					userDataList.set(j, userDataList.get(i));
					userDataList.set(i, tempUserData);
				}
			}
		}
		return userDataList;
	}	
	
	public ArrayList<UserData> sortByRollNumber(ArrayList<UserData> userDataList){
		Collections.sort(userDataList, new SortUserDataByRollNumber());
		return userDataList;
	}
	
	public ArrayList<UserData> sortByName(ArrayList<UserData> userDataList){
		Collections.sort(userDataList, new SortUserDataByName());
		return userDataList;
	}
	
	public ArrayList<UserData> sortByAge(ArrayList<UserData> userDataList){
		Collections.sort(userDataList, new SortUserDataByAge());
		return userDataList;
	}
}

