package models;

public class LinkedList<T> {
    private Node<T> head;
    private int size;
    
    
    
    public void appendToTail(T value) {
        if (head == null) {
            head = new Node<>(value);
            size++;
            return;
        }
    }

    public T findByValue(T value){
        Node<T> current =head;
        while(current!=null){
            if(current.getValue().equals(value)){
                return current.getValue();
            }
            current= current.getNext();

        }
        return null;
    }

    public void deleteByValue(T value) {
        
        if (head == null) {
            return; 
        }

        
        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }

        
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return; 
            }
            current = current.getNext();
        }
    }
    public void print() {
        Node<T> current = head;
    
        while (current != null) {
            System.out.print(current.getValue());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
    
        System.out.println(); 
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    

}
    
    
    