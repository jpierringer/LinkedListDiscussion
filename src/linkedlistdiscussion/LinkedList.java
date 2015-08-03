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
//******************************************************************************

package linkedlistdiscussion;

public class LinkedList<T> {
    Node<T> head;
    
    public LinkedList() {
        head = null;
    }
    
    public T getHead() {
        return get(0);
    }
    
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
    
    public void addHead(T element) {
        Node<T> node = new Node<>(element);
        node.setNext(head);
        head = node;
    }
    
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
    
    public T popHead() {
        
        if(head == null) {
            return null;
        }
        
        Node<T> temp = head;
        head = head.getNext();
        return temp.getValue();
    }
    
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
