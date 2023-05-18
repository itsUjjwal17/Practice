class Calculation {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }
}

class My_calculation extends Calculation {
    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
}

public class assignment8 {
    public static void main(String[] args) {
        My_calculation obj = new My_calculation();
        System.out.println("Addition: " + obj.addition(2,3));
        System.out.println("Subtraction: " + obj.subtraction(5,2));
        System.out.println("Multiplication: " + obj.multiplication(4,5));
        System.out.println("Division: " + obj.division(8,4));
    }
}
