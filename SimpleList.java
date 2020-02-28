package cse360assign2;

import java.util.*;

/**
 * Author Name: Rosny Fletez Jr
 * Course: CSE360
 * Class ID: 229
 * Assignment #: Assignment 2
 * Description: This Assignment 2 is to create a simple class and
 * 		practice Javadoc, by creating unit tests and using JUnit.
 * 		This file contains methods with their own functionalities, along
 * 		with new methods to implement, such as the append(), size(), first(), and last(). 
 * 
 * You can include the Github link on this JavaDoc, and on the comment body-tag in Submissions.
 * Github URL: 
 */

public class SimpleList {
	
	/**
	 * Private variables used for implementing the methods listed below.
	 */
	private int[] list; //The array to contain certain elements for testing.
	private int count; //The number of elements in the list.
	
	
	/**
	 * Constructor method to initialize the private variables.
	 */
	public SimpleList() { 
		list = new int[10];
		count = 0;
	}
	
	
	/**
	 * Adding the parameter to the list
	 * @param value An integer to be added to the list
	 */
	public void add(int value) {
		if(count == list.length) {
			//if list is full, another array is created to store the original array's elements.
			
			int increase = (int)list.length / 2;
			
			int size = list.length + increase;
			int[] newArray = Arrays.copyOf(list, size);
			
			list = newArray;
		}
		
			int temp = list[0]; //storing the first element in list
			int temp2;
			for(int start = 0; start < count; start++) {
				temp2 = list[start + 1];
				list[start + 1] = temp;
				temp = temp2;
			}
			list[0] = value;
			count = count + 1;
	}
	
	
	/**
	 * Removing the parameter from the list.
	 * @param value An integer to be removed from the list
	 */
	public void remove(int value) {
		boolean flag = false;
		int index = 0;
		int size = list.length;
		double decrease;
		int newSize;
		
		for(int start = 0; start < count; start++) {
			
			if(list[start] == value) {
				index = start;
				flag = true;
				break; //this is to find the first index with the value, not to the last index.
				
				//If found, flag will be set to true.
			}
 		}
		
		if(flag == true) {
			//If flag is true, the size of the list will decrease.
			
			int temp;
			for(int start = index; start < count; start++) {
				temp = list[start + 1];
				list[start] = temp;
			}
			count = count - 1;
			
			decrease = (size - count) / size;
			double roundOf = Math.round(decrease * 100.0) / 100.0;
			
			newSize = (int)(roundOf * size);
			
			int[] newArray = new int[newSize];
			
			if(roundOf > 0.25) { //more than 25% empty spaces, decrease the size of list.
				newArray = Arrays.copyOf(list, newSize);
				list = newArray;
			}
			
		}
	}
	
	
	/**
	 * Counting the number of values within the list array.
	 * @return An integer representing the amount of values in the list.
	 */
	public int count() {
		
		int initialValue = 0; 

		while(initialValue < count) {
			//starting point at zero, to count to the value of count.
			initialValue = initialValue + 1;
		}
		
		return initialValue;
	}
	
	
	/**
	 * The String representation of the list 
	 */
	public String toString() {
		String listArray = "";
		
		if(count == 0) {
			return listArray;
		}
		
		for(int start = 0; start < count-1; start++) {
			listArray = listArray + list[start] + " ";
			//System.out.println(list[start]);
			//Each value will have a space in-between.
		}
		
		//The last value in the list will not have a space after it. 
		listArray = listArray + list[count - 1];  
		
		return listArray;
	}
	
	
	/**
	 * Searching for an index containing a specific value.
	 * 
	 * @param value An integer to be searched in the list.
	 * @return An integer of the index from the list or -1.
	 */
	public int search(int value) { 
		int initialValue = 0;
		
		while(initialValue < count) {
			//Starting at zero, and incrementing to the next index on the list 
			//until the value of the parameter is found.
			
			if(list[initialValue] == value) {
				return initialValue;
			}
			else {
				initialValue = initialValue + 1;
			}
		}
		
		//If the value of the parameter is not found, it will return -1.
		return -1;
	}
	
	

	
	
	
}//end of SimpleList class.
