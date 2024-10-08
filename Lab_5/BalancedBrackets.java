import java.util.Stack;
public class BalancedBrackets {

    // Method to check if brackets are balanced
    public static boolean isBalanced(String exp) {
        // Declare a character stack
        Stack<Character> stack = new Stack<>();

        // Traverse the expression
        for (int i = 0; i < exp.length(); i++) {
            char currentChar = exp.charAt(i);

            // If it's an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // If it's a closing bracket
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // If the stack is empty or top of the stack doesn't match the closing bracket
                if (stack.isEmpty()) {
                    return false;  // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, currentChar)) {
                    return false;  
                }
            }
        }

        return stack.isEmpty();
    }

    
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression1 = "({[a+b]+c}-1)";
        String expression2 = "{[(()})]";
        
        System.out.println("Is expression 1 balanced? " + isBalanced(expression1));  
        System.out.println("Is expression 2 balanced? " + isBalanced(expression2));  
        
    }
}