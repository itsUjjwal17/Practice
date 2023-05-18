import java.util.HashMap;
import java.util.Scanner;

public class f {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of first array (m): ");
    int m = sc.nextInt();
    int[] arr1 = new int[m];
    System.out.print("Enter the elements of first array: ");
    for (int i = 0; i < m; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.print("Enter the size of second array (n): ");
    int n = sc.nextInt();
    int[] arr2 = new int[n];
    System.out.print("Enter the elements of second array: ");
    for (int i = 0; i < n; i++) {
      arr2[i] = sc.nextInt();
    }

    HashMap<Integer, Integer> hmap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (hmap.containsKey(arr2[i])) {
        hmap.put(arr2[i], hmap.get(arr2[i]) + 1);
      } else {
        hmap.put(arr2[i], 1);
      }
    }

    for (int i = 0; i < m; i++) {
      int count = 0;
      for (int key : hmap.keySet()) {
        if (key <= arr1[i]) {
          count += hmap.get(key);
        }
      }
      System.out.print(count + " ");
    }
  }
}
