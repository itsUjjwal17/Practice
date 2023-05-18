import java.util.Stack;

class Queue<T> {
    Stack<T> input = new Stack<T>(); 
    Stack<T> output = new Stack<T>(); 
    
    /*The method pop which return the element poped out of the stack*/
    T dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }
	
    /* The method push to push element into the stack */
    void enqueue(T x) {
        input.push(x);	
    }
}

public class assignment12 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
    }
}
