class StackUsingArray {
    int top;
    int[] stackArray;
    int size;

    StackUsingArray(int size) {
        this.top = -1;
        this.size = size;
        stackArray = new int[size];
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stackArray[top] = item;
            System.out.println(item + " pushed to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int item = stackArray[top];
            top--;
            return item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
}

