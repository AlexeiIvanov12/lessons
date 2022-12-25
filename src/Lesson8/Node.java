package Lesson8;

public class Node {
    final Object value;

    Node next;
    Node prev;

    public Node(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
