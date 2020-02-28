package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Author Name: Rosny Fletez Jr
 * Course: CSE360
 * Class ID: 229
 * Assignment #: Assignment 1
 * Description: This Assignment 1 is to create a simple class and
 * 		practice Javadoc, by creating unit tests and using JUnit. This file is
 * 		to create unit test methods and use some assert statements for certain
 * 		methods from the SimpleList.java class.
 * 
 */

class SimpleListTest {	
	
	@Test
	void testConstructor() {
		SimpleList list = new SimpleList();
		
		list.add(9);
		list.add(7);
	    list.add(5);
	    list.add(7);
	    list.add(2);
		list.remove(7);
		list.remove(2);
		list.add(8);
		
		list.append(10);
		list.append(11);
		list.append(12);
	    
		String result = list.toString();
		//int result = list.search(7);
		
		int first = list.first();
		int last = list.last();
		
		int search = list.search(9);
		int size = list.size();
		
		assertEquals("8 5 7 9 10 11 12", result);
		assertEquals(8, first);
		assertEquals(12, last);
		
		assertEquals(3, search);
		
		assertEquals("8 5 7 9 10 11 12", result);
		
		assertEquals(3, size);
	}
	
	/**
	 * Testing for the add method from SimpleList class.
	 *//*
	@Test
	void testAdd() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		
		list.append(20);
		list.append(21);
		list.append(22);

		assertEquals("20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 20 21 22", list.toString());
	}
	
	
	@Test
	void testRemove() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.append(11);
		//list.append(12);
		
		assertEquals("10 9 8 7 6 5 4 3 2 1 11", list.toString());
	}
	
	
	@Test 
	void testCount() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		
		int count = list.count();
		//int result = list.search(3);
		
		assertEquals(20, count);
	}
	
	
	
	@Test
	void removeCount() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(2);
		list.remove(3);
		
		int count = list.count();
		
		assertEquals(3, count);
	}
	
	
	@Test
	void findFirst() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		list.remove(8);
		
		int foundFirst = list.first();
		int foundLast = list.last();
		
		assertEquals(7, foundFirst);
		assertEquals(1, foundLast);
	}
	*/
	
	
	/*@Test
	void findSize() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		int size = list.size();
		
		assertEquals(6, size);
	}*/
	
	
	
	/*
	*//**
	 * Testing for the remove method from SimpleList class.
	 *//*
	@Test
	void testRemove() {
		SimpleList list = new SimpleList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5); 
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.remove(5);
		assertEquals(list.toString(), "1 2 3 4 6 7 8 9 10");
	}
	
	
	*//**
	 * Testing for the count method from SimpleList class.
	 *//*
	@Test
	void testCount() {
		SimpleList list = new SimpleList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5); 
		list.add(6);
		list.add(7);
		
		list.count();
		
		assertEquals(list.count(), 7);
	}
	
	
	*//**
	 * Testing for the toString method from SimpleList class.
	 *//*
	@Test
	void testToString() { 
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		assertEquals(list.toString(), "1 2 3 4");
	}
	
	
	*//**
	 * Testing for the search method from SimpleList class.
	 *//*
	@Test 
	void testToSearch() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5); 
		list.add(6);
		list.add(7);
		
		list.search(11);
		assertEquals(list.search(11), -1);
	}
	
	*/

}//end of SimpleListTest class.

