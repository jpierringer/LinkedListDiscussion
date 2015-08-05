// Copyright 2015 Kohler Co.  Unpublished and confidential.  All rights reserved.
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
        int index = 0;
        LinkedList<String> instance = new LinkedList<>();
        String expResult = null;
        String result = instance.get(index);
        assertEquals(expResult, result);
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
        System.out.println("addTail");
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
    public void testAddNodeToMiddleOfList() {
        System.out.println("addNodeToMiddleOfList");
        LinkedList<Integer> instance = new LinkedList<>();

        instance.addHead(1);
        instance.addTail(2);
        instance.addTail(3);
        instance.addTail(4);
        
        boolean result = instance.add(2, Integer.SIZE);
        
        assertEquals(true, result);
        assertEquals((long)instance.get(2), (long)Integer.SIZE);
    }
    
    /**
     * Test of popHead method, of class LinkedList.
     */
    @Test
    public void testPopHead() {
        System.out.println("popHead");
        LinkedList<String> instance = new LinkedList<>();
        instance.addHead("First Element");
        instance.addTail("Second Element");
        instance.addTail("Third Element");
        instance.add(3, "Fourth Element");
        
        String result1 = instance.popHead();
        String result2 = instance.popHead();
        String result3 = instance.popHead();
        String result4 = instance.popHead();
        
        assertEquals("Fourth Element", result4);
        assertEquals(null, instance.popHead());
    }

    /**
     * Test of popTail method, of class LinkedList.
     */
    @Test
    public void testPopTail() {
        System.out.println("popTail");
        LinkedList<String> instance = new LinkedList<>();
        instance.addHead("First Element");
        instance.addTail("Second Element");
        instance.addTail("Third Element");
        instance.add(3, "Fourth Element");
        
        String result1 = instance.popTail();
        String result2 = instance.popTail();
        String result3 = instance.popTail();
        String result4 = instance.popTail();
        String result5 = instance.popTail();
        
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
        LinkedList<String> instance = new LinkedList<>();
        instance.add(0, "First Node");
        instance.addTail("Second Node");
        
        String result1 = instance.popNode(1);
        String result2 = instance.popNode(0);
        String result3 = instance.popNode(0);
        
        assertEquals("Second Node", result1);
        assertEquals("First Node", result2);
        assertEquals(null, result3);
    }
}
