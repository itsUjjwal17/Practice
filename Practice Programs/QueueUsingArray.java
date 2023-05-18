class Queue {
    private int front;
    private int rear;
    private int[] queueArray;
    private int size;
    
    public Queue(int size) {
      this.size = size;
      queueArray = new int[size];
      front = 0;
      rear = -1;
    }
    
    public void add(int item) {
      if (rear == size - 1) {
        System.out.println("Queue is full!");
      } else {
        rear++;
        queueArray[rear] = item;
      }
    }
    
    public int remove() {
      if (isEmpty()) {
        System.out.println("Queue is empty!");
        return -1;
      } else {
        int item = queueArray[front];
        front++;
        return item;
      }
    }
    
    public int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty!");
        return -1;
      } else {
        return queueArray[front];
      }
    }
    
    public int size() {
      return rear - front + 1;
    }
    
    public boolean isEmpty() {
      return (rear == -1 || front > rear);
    }
    
    public void print() {
      if (isEmpty()) {
        System.out.println("Queue is empty!");
      } else {
        System.out.println("Queue: ");
        for (int i = front; i <= rear; i++) {
          System.out.println(queueArray[i]);
        }
      }
    }
  }
  