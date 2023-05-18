public class Recur {
    public static void main(String[] args) {
        int fib = recu(10);
        System.out.println(fib);
    }

    static int recu(int n) {
        if (n < 2) {
            return n;
        }
        return recu(n - 1) + recu(n - 2);
    }
}