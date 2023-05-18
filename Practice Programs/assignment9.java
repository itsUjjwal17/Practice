import java.util.Stack;

public class assignment9 {
    public static void main(String[] args) {
        String exp1 = "[()]{}{[()()]()}";
        System.out.println(checkExpression(exp1)); // should return true
        // String exp2 = "[(])";
        // System.out.println(checkExpression(exp2)); // should return false
    }
    public static boolean checkExpression(String exp) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    } 
}
