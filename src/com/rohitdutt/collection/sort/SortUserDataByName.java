/**
 * 
 */
package com.rohitdutt.collection.sort;

import java.util.Comparator;

/**
 * @author Rohitdutt Parsai
 *
 */
public class SortUserDataByName implements Comparator<UserData>{
	
	@Override
	public int compare(UserData userData1, UserData userData2) {
		// TODO Auto-generated method stub
		return userData1.getName().compareTo(userData2.getName());
	}
}
