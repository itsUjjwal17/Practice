import java.util.ArrayList;
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        //Inserting elements
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(75);
        
        //Inserting 65 at index 3
        list.add(3, 65);
        
        //Inserting 25 at index 0
        list.add(0, 25);
        
        //Getting element at index 1
        System.out.println("Element at index 1: " + list.get(1));
        
        //Removing element at index 0
        list.remove(0);
        
        //Printing size of the List
        System.out.println("Size of the List: " + list.size());
 
        //Checking if list contains 35
        if(list.contains(35)) {
            System.out.println("List contains 35.");
        } else {
            System.out.println("List does not contain 35.");
        }
 
        //Iterating and printing elements of the list
        System.out.println("Elements of the List:");
        for(Integer i : list) {
            System.out.println(i);
        }
 
        //Clearing the list
        list.clear();
 
        //Checking if list is empty
        if(list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
    }
}
