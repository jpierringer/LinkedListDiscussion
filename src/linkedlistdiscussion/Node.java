// Copyright 2015 Kohler Co.  Unpublished and confidential.  All rights reserved.
// Author: Jayson Pierringer
// Linked List is a project for use during interviews to test the candidates
// ability to explain a linked list and other data structures, create/modify
// unit tests, troubleshoot bugs, and possibly extend existing code to implement
// multithreading concepts or double linked list functionality.
//******************************************************************************
// Revision   Author    Description
// 2015-08-02 JSP       Created
//******************************************************************************


package linkedlistdiscussion;

public class Node<T> {
    T element;
    Node<T> next;

    public Node() {
        next = null;
        element = null;
    }

    public Node(T element) {
        next = null;
        this.element = element;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> node) {
        next = node;
    }
    
    public void unsetNext() {
        next = null;
    }
    
    public void setValue( T value ) {
        this.element = value;
    }
    
    public T getValue() {
        return element;
    }
    
    @Override
    public String toString() {
        return element.toString();
    }
}
