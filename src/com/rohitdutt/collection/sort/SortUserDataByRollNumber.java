/**
 * 
 */
package com.rohitdutt.collection.sort;

import java.util.Comparator;

/**
 * @author Rohitdutt Parsai
 *
 */
public class SortUserDataByRollNumber implements Comparator<UserData> {
	public int compare(UserData userData1, UserData userData2){	
		if(userData1.getRollNumber() == userData2.getRollNumber()) {
			return 0;
		}else if(userData1.getRollNumber() > userData2.getRollNumber()) {
			return 1;
		}else {
			return - 1;
		}
	}
}
