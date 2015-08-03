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
}
