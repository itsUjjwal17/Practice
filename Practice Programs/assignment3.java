import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of indices: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even indices contains: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd indices contains: ");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}




