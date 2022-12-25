package Lesson8;

public class LinkedList {
    Node head;
    Node tail;

    public void addFirst(Object value) {
        Node firstNode = new Node(value);

        firstNode.next = head;
        {
            head.prev = firstNode;
        }

        head = firstNode;
        if (tail == null) {
            tail = firstNode;

        }
    }

    public void addLast(Object value) {
        Node LastNode = new Node(value);

        LastNode.prev = tail;


        if (tail !=null) {
            tail.next = LastNode;

        }
        tail = LastNode;

        if(head==null) {
            head =LastNode;
        }

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}


