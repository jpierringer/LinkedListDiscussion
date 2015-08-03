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
        System.out.println("get");
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
        System.out.println("size");
        LinkedList<String> instance = new LinkedList<>();
        int expResult = 0;
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
        boolean expResult = true;
        boolean result = instance.add(index, element);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAddNodeToMiddleOfList() {
        System.out.println("addNodeToMiddleOfList");
        LinkedList<Integer> instance = new LinkedList<>();
        boolean expResult = true;
        instance.addHead(1);
        instance.addTail(2);
        instance.addTail(3);
        instance.addTail(4);
        boolean result = instance.add(2, Integer.SIZE);
        
        assertEquals(expResult, result);
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
        String expResult = "First Element";
        String result = instance.popHead();
        assertEquals(expResult, result);
        assertEquals(null, instance.popHead());
    }

    /**
     * Test of popTail method, of class LinkedList.
     */
    @Test
    public void testPopTail() {
        System.out.println("popTail");
        LinkedList<String> instance = new LinkedList<>();
        String expResult = null;
        String result = instance.popTail();
        assertEquals(expResult, result);
    }

    /**
     * Test of popNode method, of class LinkedList.
     */
    @Test
    public void testPopNode() {
        System.out.println("popNode");
        int index = 0;
        LinkedList<String> instance = new LinkedList<>();
        String expResult = null;
        String result = instance.popNode(index);
        assertEquals(expResult, result);
    }
    
}
