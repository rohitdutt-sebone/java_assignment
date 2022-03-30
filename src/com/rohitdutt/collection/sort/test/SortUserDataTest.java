/**
 * 
 */
package com.rohitdutt.collection.sort.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.rohitdutt.collection.sort.SortUserDataImpl;
import com.rohitdutt.collection.sort.SortingExecution;
import com.rohitdutt.collection.sort.UserData;

/**
 * @author Rohitdutt Parsai
 *
 */
class SortUserDataTest {

	@Test
	void sortTest() {
		SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		SortingExecution sortingExecution = new SortingExecution();
		ArrayList<UserData> userDataList = new ArrayList<UserData>();
		UserData userData1 = sortingExecution.getUserData(101, 20, "Rama");
		UserData userData2 = sortingExecution.getUserData(104, 24, "Rohit");
		UserData userData3 = sortingExecution.getUserData(103, 21, "Vivek");
		UserData userData4 = sortingExecution.getUserData(108, 23, "Akash");
		UserData userData5 = sortingExecution.getUserData(102, 21, "Ravi");
		
		userDataList.add(userData1);
		userDataList.add(userData2);
		userDataList.add(userData3);
		userDataList.add(userData4);
		userDataList.add(userData5);
		
		
		ArrayList<UserData> userDataList2 = new ArrayList<UserData>();
		userDataList2.add(userData1);
		userDataList2.add(userData5);
		userDataList2.add(userData3);
		userDataList2.add(userData2);
		userDataList2.add(userData4);
		assertEquals(userDataList2, sortUserDataImpl.sortByRollNumber(userDataList));
		
//		
//		userDataList.add(sortingExecution.getUserData(101, 20, "Rama"));
//		userDataList.add(sortingExecution.getUserData(104, 24, "Rohit"));
//		userDataList.add(sortingExecution.getUserData(103, 21, "Vivek"));
//		userDataList.add(sortingExecution.getUserData(108, 23, "Akash"));
//		userDataList.add(sortingExecution.getUserData(102, 21, "Ravi"));
//		ArrayList<UserData> userDataList2 = new ArrayList<UserData>();
//		userDataList2.add(sortingExecution.getUserData(101, 20, "Rama"));
//		userDataList2.add(sortingExecution.getUserData(102, 21, "Ravi"));
//		userDataList2.add(sortingExecution.getUserData(103, 21, "Vivek"));
//		userDataList2.add(sortingExecution.getUserData(104, 24, "Rohit"));
//		userDataList2.add(sortingExecution.getUserData(108, 23, "Akash"));
	}

}
