import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class assignment11 {
    public static void main(String[] args) {
        Queues stack = new Queues();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push an element into stack");
            System.out.println("2. Pop an element from stack");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a) {
        q2.add(a);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    //Function to pop an element from stack using two queues. 
    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.poll();
    }
}



