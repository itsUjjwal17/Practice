public class h{

    public static void main(String[] args) {
        int n=658948561; 
        int p=0;
        while(n>0){
            int temp=n%10;
            n/=10;
            p=p*10+temp;
            System.out.println(p);
        }
        System.out.println(p);
    }
}