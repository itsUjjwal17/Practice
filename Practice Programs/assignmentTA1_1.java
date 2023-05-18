import java.util.*;
public class assignmentTA1_1
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Arrays.sort(arr2);
        Map<Integer,Integer> map1 = new HashMap<>();
        
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i:arr1){
          list.add(i);
      }
      Collections.sort(list);
      
      int second = 0;
      int temp=0;
      for(int i=0;i<m;i++){
         int num1 = list.get(i);
         while(second<n&&arr2[second]<=num1){
            temp++;
            second++;
         }
            map1.putIfAbsent(num1, temp);
      }
       for(int i: arr1){
        res.add(map1.get(i));
       }
       
       return res;
    }
}