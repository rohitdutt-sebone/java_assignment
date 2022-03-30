/**
 * 
 */
package com.rohitdutt.collection.sort;

import java.util.ArrayList;

/**
 * SortUserData
 * This is an interface for sorting user data
 * @author Rohitdutt Parsai
 * 21/03/2022
 */
public interface SortUserData {

	ArrayList<UserData> sort(ArrayList<UserData> userDataList);
	
	ArrayList<UserData> sortByRollNumber(ArrayList<UserData> userDataList);

	ArrayList<UserData> sortByName(ArrayList<UserData> userDataList);
	
	ArrayList<UserData> sortByAge(ArrayList<UserData> userDataList);
}
