// Copyright 2015 Kohler Co.  All rights reserved.
// Author: Jayson Pierringer
// Linked List is a project for use during interviews to test the candidates
// ability to explain a linked list and other data structures, create/modify
// unit tests, troubleshoot bugs, and possibly extend existing code to implement
// multithreading concepts or double linked list functionality.
//******************************************************************************
// Revision   Author    Description
// 2015-08-02 JSP       Created
// 2015-08-03 JSP       Improved completeness of testPopHead and testPopTail
//******************************************************************************


package linkedlistdiscussion;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    /**
     * Test of getHead method, of class LinkedList.
     */
    @Test
    public void testGetHeadWithNoNodes() {
        System.out.println("getHeadWithNoNodes");
        LinkedList<String> instance = new LinkedList<>();
        String expResult = null;
        String result = instance.getHead();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class LinkedList.
     */
    @Test
    public void testGetOnEmptyList() {
        System.out.println("getOnEmptyList");
        LinkedList<String> instance = new LinkedList<>();
        String result1 = instance.get(0);
        String result2 = instance.get(-1);
        instance.addHead("First Element");
        String result3 = instance.get(0);
        String result4 = instance.get(2);
        assertEquals(null, result1);
        assertEquals(null, result2);
        assertEquals("First Element", result3);
        assertEquals(null, result4);
    }

    /**
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSizeOnEmptyList() {
        System.out.println("sizeOnEmptyList");
        LinkedList<String> instance = new LinkedList<>();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedList<Integer> instance = new LinkedList<>();
        instance.addHead(1);
        instance.addHead(2);
        instance.addHead(3);
        instance.popHead();
        instance.addHead(3);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of addHead method, of class LinkedList.
     */
    @Test
    public void testAddNullHeadToEmptyList() {
        System.out.println("addHeadToEmptyList");
        String element = null;
        LinkedList<String> instance = new LinkedList<>();
        instance.addHead(element);
    }

    /**
     * Test of addTail method, of class LinkedList.
     */
    @Test
    public void testAddNullTailToEmptyList() {
        System.out.println("addNullTailToEmptyList");
        String element = null;
        LinkedList<String> instance = new LinkedList<>();
        instance.addTail(element);
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAddNodeToEmptyList() {
        System.out.println("addNodeToEmptyList");
        int index = 0;
        String element = "Added Element";
        LinkedList<String> instance = new LinkedList<>();

        boolean result = instance.add(index, element);
        
        assertEquals(true, result);
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAddNodeWithBadIndex() {
        System.out.println("addNodeWithBadIndex");
        LinkedList<String> instance = new LinkedList<>();

        //Test adding an element with a low index value
        boolean result1 = instance.add(-1, "Fail 1");
        
        //Test adding an element with a high index value
        boolean result2 = instance.add(1, "Fail 2");
        
        //Test adding an element with a good index value
        boolean result3 = instance.add(0, "Success 1");

        //Test adding an element with a good index value
        boolean result4 = instance.add(2, "Fail 3");
        
        //Test adding an element with a good index value
        boolean result5 = instance.add(1, "Success 2");
        
        assertEquals(false, result1);
        assertEquals(false, result2);
        assertEquals(true, result3);
        assertEquals(false, result4);
        assertEquals(true, result5);
    }
    
    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAddNodeToMiddleOfList() {
        System.out.println("addNodeToMiddleOfList");
        LinkedList<Integer> testList = new LinkedList<>();

        testList.addHead(1);
        testList.addTail(2);
        testList.addTail(3);
        testList.addTail(4);
        
        boolean result = testList.add(2, Integer.SIZE);
        
        assertEquals(true, result);
        assertEquals((long)testList.get(2), (long)Integer.SIZE);
    }
    
    /**
     * Test of popHead method, of class LinkedList.
     */
    @Test
    public void testPopHead() {
        System.out.println("popHead");
        LinkedList<String> testList = new LinkedList<>();
        testList.addHead("First Element");
        testList.addTail("Second Element");
        testList.addTail("Third Element");
        testList.add(3, "Fourth Element");
        
        String result1 = testList.popHead();
        String result2 = testList.popHead();
        String result3 = testList.popHead();
        String result4 = testList.popHead();
        
        assertEquals("Fourth Element", result4);
        assertEquals(null, testList.popHead());
    }

    /**
     * Test of popTail method, of class LinkedList.
     */
    @Test
    public void testPopTail() {
        System.out.println("popTail");
        LinkedList<String> testList = new LinkedList<>();
        
        String result0 = testList.popTail();
        
        testList.addTail("First Element");
        testList.addTail("Second Element");
        testList.addTail("Third Element");
        testList.addTail("Fourth Element");
        
        String result1 = testList.popTail();
        String result2 = testList.popTail();
        String result3 = testList.popTail();
        String result4 = testList.popTail();
        String result5 = testList.popTail();
        
        assertEquals("First Element", result4);
        assertEquals(null, result5);
    }

    /**
     * Test of popNode method, of class LinkedList.
     */
    @Test
    public void testPopNode() {
        
        System.out.println("popNode");
        int index = 1;
        LinkedList<String> testList = new LinkedList<>();
        
        testList.add(0, "First Node"); //Equivalent to addHead("First Node")
        testList.addTail("Second Node"); //Equivalent to add(1, "Second Node");
        
        //Bad indexes
        String result0 = testList.popNode(-1);
        String result01 = testList.popNode(2);
        
        //Pop the tail node
        String result1 = testList.popNode(1);
        
        //Pop the head node which will empty the list
        String result2 = testList.popNode(0);
        
        assertEquals(null, result0);
        assertEquals(null, result01);
        assertEquals("Second Node", result1);
        assertEquals("First Node", result2);
    }
}
