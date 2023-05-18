
import java.util.*;

public class l {
    public static void main(String[] args) {
       
       
        String a="horse";
        String b="ros";
        System.out.println(minDistance(a, b));
    }
    
    
    static int minDistance(String word1, String word2) {
        int count=0;
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                if(word1.charAt(i)==word2.charAt(j)){
                    if(word1.charAt(i+1)==word2.charAt(j+1)){
                        int[] arr=new
                    }
                }
            }
        }
        return count;
    }
}
