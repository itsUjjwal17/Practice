import java.util.Scanner;
public class assignment5 {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its Fibonacci: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci of " + num + " is " + fibonacci(num));
    }
}
