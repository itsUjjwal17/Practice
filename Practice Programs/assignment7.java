public class assignment7 {
    public static void main(String[] args) {
      int[] arr = {64, 34, 25, 12, 22, 11, 90};
      quickSort(arr, 0, arr.length-1);
      System.out.println("Sorted array: ");
      printArray(arr);
    }
  
    static void quickSort(int[] arr, int low, int high) {
      if (low < high) {
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
      }
    }
  
    static int partition(int[] arr, int low, int high) {
      int pivot = arr[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
          i++;
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      int temp = arr[i+1];
      arr[i+1] = arr[high];
      arr[high] = temp;
      return i+1;
    }
  
    static void printArray(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
  