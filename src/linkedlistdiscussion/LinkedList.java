// Copyright 2015 Kohler Co.  Unpublished and confidential.  All rights reserved.
// Author: Jayson Pierringer
// Linked List is a project for use during interviews to test the candidates
// ability to explain a linked list and other data structures, create/modify
// unit tests, troubleshoot bugs, and possibly extend existing code to implement
// multithreading concepts or double linked list functionality.
//******************************************************************************
// Revision   Author    Description
// 2015-08-02 JSP       Created
// 2015-08-03 JSP       Fixed bug with popping last remaining node in popNode()
// 2015-08-03 JSP       Added Javadoc comments to public methods
//******************************************************************************

package linkedlistdiscussion;

public class LinkedList<T> {
    protected Node<T> head;
    
    public LinkedList() {
        head = null;
    }
    
    /**
     * Get the head node's value
     * @return the head element of the list.
     */
    public T getHead() {
        return get(0);
    }
    
    /**
     * Access an element in the linked list by index from 0 to size - 1.
     * @param index The location of the element to get from the list.
     * @return a selected element from the list specified by index.
     */
    public T get(int index) {
        
        if(head == null) {
            return null;
        }
        
        int i = 0;
        Node<T> node = head;
        while(i < index && node.getNext() != null) {
            node = node.getNext();
            i++;
        }
        return node.getValue();
    }
    
    /**
     * Get a count of all the elements in the linked list.
     * @return Count of elements in list.
     */
    public int size() {
        if(head == null) {
            return 0;
        }
        
        int i = 1;
        Node<T> node = head;
        while(node.getNext() != null) {
            node = node.getNext();
            i++;
        }
        return i;
    }
    
    /**
     * Add an element to the head (or front) of the list.
     * @param element The data to add to the head of the list.
     */
    public void addHead(T element) {
        Node<T> node = new Node<>(element);
        node.setNext(head);
        head = node;
    }
    
    /**
     * Add an element to the tail (or end) of the list.
     * @param element The data to add to the end of the list.
     */
    public void addTail(T element) {
        
        if(head == null) {
            addHead(element);
        } else {
            Node<T> node = new Node<>(element);
            Node<T> temp = head;

            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
    
    /**
     * Insert an element into the list at the specified index location.
     * @param index The location to add the new element.
     * @param element The data to add to the list.
     * @return true if the element was successfully added, otherwise false.
     */
    public boolean add(int index, T element) {
        if(index < 0 || index > this.size()) {
            return false;
        } else if (index == 0) {
            addHead(element);
            return true;
        } else if (index == size()) {
            addTail(element);
            return true;
        }
        
        int i = 0;
        Node<T> preTemp = head;
        Node<T> temp = head;
        
        while((i < index) && (temp.getNext() != null)) {
            preTemp = temp;
            temp = temp.getNext();
            i++;
        }
        
        if(i >= index-1) {
            Node<T> newNode = new Node<>(element);
            newNode.setNext(preTemp.getNext());
            preTemp.setNext(newNode);
            return true;
        }
        return false;
    }
    
    /**
     * popHead will remove the head node from the list and return it.
     * @return head element.
     */
    public T popHead() {
        
        if(head == null) {
            return null;
        }
        
        Node<T> temp = head;
        head = head.getNext();
        return temp.getValue();
    }
    
    /**
     * popTail will remove the last node from the list and return it.
     * @return tail element.
     */
    public T popTail() {
        if(head == null) {
            return null;
        }
        
        Node<T> tail = head;
        Node<T> preTail = head;
        
        if(head.getNext() == null) {
            tail = head;
            head = null;
        }

        while (tail.getNext() != null) {
            preTail = tail;
            tail = tail.getNext();
        }
        preTail.unsetNext();
        
        return tail.getValue();
    }

    /**
     * popNode will remove the selected node from the list and return it.
     * @param index The location of the element to pop and return.
     * @return element at specified location.
     */
    public T popNode(int index) {
        if(head == null || index < 0 || index >= this.size()) {
            return null;
        }
        
        int i = 0;
        Node<T> temp = head;
        Node<T> preTemp = head;
        
        while(i < index && temp.getNext() != null) {
            preTemp = temp;
            temp = temp.getNext();
            i++;
        }
        
        // There is only one element remaining in the list and we are popping it 
        // off the list so set head to null since the list will be empty.
        if(preTemp.equals(temp)) {
            head = null;
        }
        
        if(preTemp.equals(temp) && i == index) {
            preTemp.setNext(temp.getNext());
        }
        
        return temp.getValue();
    }

}
