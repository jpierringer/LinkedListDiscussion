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

public class LinkedListDiscussion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        
        System.out.println("Size: " + myList.size());
        myList.addHead("FirstHead");
        System.out.println("Size: " + myList.size());
        myList.addTail("FirstTail");
        System.out.println("Size: " + myList.size());
        myList.addHead("SecondHead");
        System.out.println("Size: " + myList.size());
        myList.addHead("ThirdHead");
        System.out.println("Size: " + myList.size());
        myList.addHead("SecondTail");
        System.out.println("Size: " + myList.size());
        myList.addHead("FourthHead");
        System.out.println("Size: " + myList.size());
        myList.addHead("ThirdTail");
        System.out.println("Size: " + myList.size());
        
        for(int i = 0; i < myList.size(); i++) {
            System.out.println("Value: " + myList.get(i));
        }
        
        String value = "";
        while((value = myList.popHead()) != null) {
            System.out.println("Value: " + value + " size: " + myList.size());
        }
        
        myList.popHead();
        System.out.println("Value: " + value + " size: " + myList.size());
        myList.popTail();
        System.out.println("Value: " + value + " size: " + myList.size());
        myList.popNode(2);
        System.out.println("Value: " + value + " size: " + myList.size());
        myList.add(0,"Insert1");
        System.out.println("Value: " + myList.get(0) + " size: " + myList.size());
        myList.add(0,"Insert2");
        System.out.println("Value: " + myList.get(0) + " size: " + myList.size());
        myList.add(0,"Insert3");
        System.out.println("Value: " + myList.get(0) + " size: " + myList.size());
        myList.add(2,"Insert4");
        System.out.println("Value: " + myList.get(2) + " size: " + myList.size());
        
        while((value = myList.popHead()) != null) {
            System.out.println("Value: " + value + " size: " + myList.size());
        }
    }
    
    
    // The problem with this method is it changes list. Change this method so list
    // is not modified.
//    static LinkedList<String> sortedListAsc(LinkedList<String> list) {
//        LinkedList<String> temp = new LinkedList<>();
//        
//        while(list.size() > 0) {
//            String value = list.popHead();
//            
//            if(temp.size() == 0) {
//                temp.addHead(value);
//            } else {
//                if()
//            }
//        }
//    }
}
