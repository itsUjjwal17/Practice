class LinkedList {
    static class Node {
      int data;
      Node next;
      
      public Node(int data) {
        this.data = data;
        this.next = null;
      }
    }
    
    Node head;
    
    public LinkedList() {
      head = null;
    }
    
    public void addFirst(int data) {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }
    
    public void addLast(int data) {
      if (head == null) {
        head = new Node(data);
        return;
      }
      
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new Node(data);
    }
    
    public void deleteFirst() {
      if (head == null) {
        System.out.println("List is empty");
        return;
      }
      
      head = head.next;
    }
    
    public void deleteLast() {
      if (head == null) {
        System.out.println("List is empty");
        return;
      }
      
      if (head.next == null) {
        head = null;
        return;
      }
      
      Node temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
    }
    
    public boolean isEmpty() {
      return head == null;
    }
    
    public int getSize() {
      int count = 0;
      Node temp = head;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;
    }
    
    public void printList() {
      if (head == null) {
        System.out.println("List is empty");
        return;
      }
      
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }
  
