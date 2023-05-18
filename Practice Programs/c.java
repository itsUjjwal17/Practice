import java.util.*;
public class c{
    public static void main(String[] args){
        int rows=3;
        int cols=3;
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[rows][cols];
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                arr=sc.nextInt();
            }
        }
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                System.out.println(arr[i][j]);
    }
    
}
