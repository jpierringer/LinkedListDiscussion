package linkedlistdiscussion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NodeTest {
    
    public NodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNext method, of class Node.
     */
    @Test
    public void testGetNextNull() {
        System.out.println("getNextNull");
        Node<String> instance = new Node<>();
        Node expResult = null;
        Node result = instance.getNext();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNext method, of class Node.
     */
    @Test
    public void testGetNextInitialValueOfOne() {
        System.out.println("getNextOne");
        Node<String> instance = new Node<>("One");
        instance.setNext(new Node<String>("Two"));
        String expResult = "Two";
        Node<String> result = instance.getNext();
        assertEquals(expResult, result.getValue());
    }
    
    /**
     * Test of setNext method, of class Node.
     */
    @Test
    public void testSetNextToNull() {
        System.out.println("setNextToNull");
        Node<String> instance = new Node<>();
        instance.setNext(null);
    }

    /**
     * Test of unsetNext method, of class Node.
     */
    @Test
    public void testUnsetNext() {
        System.out.println("unsetNext");
        Node<String> instance = new Node<>();
        instance.unsetNext();
    }

    /**
     * Test of unsetNext method, of class Node.
     */
    @Test
    public void testUnsetNextWithNextNodes() {
        System.out.println("unsetNextWithNextNodes");
        Node<String> instance = new Node<>("One");
        assertEquals(instance.getNext(), null);
        instance.setNext(new Node<>("Two"));
        assertEquals(instance.getNext().getValue(), "Two");
        instance.setNext(new Node<>("Three"));
        assertEquals(instance.getNext().getValue(), "Three");
        instance.unsetNext();
        assertEquals(instance.getNext(), null);
    }
    
    /**
     * Test of setValue method, of class Node.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        String value = "New Value";
        Node<String> instance = new Node<>("Original Value");
        assertEquals(instance.getValue(), "Original Value");
        instance.setValue(value);
        assertEquals(instance.getValue(), "New Value");
    }

    /**
     * Test of getValue method, of class Node.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Node<String> instance = new Node<>("Node Name");
        String expResult = "Node Name";
        String result = instance.getValue();
        assertEquals(expResult, result);

    }
    
}
