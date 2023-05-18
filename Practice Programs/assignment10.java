import java.util.*;

public class assignment10 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(2);
        list.addNode(4);
        list.addNode(6);
        list.addNode(7);
        list.addNode(58);
        list.findMiddle();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void findMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node is: " + slow.data);
    }
}
