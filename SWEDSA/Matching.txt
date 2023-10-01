/*Name: Betselot Abraham
 * ID: 1612 /14
 * Section: 1
 * Title: Matching
 */
import java.util.*;

public class Matching {
    
   
    private static boolean isValid(char firstChar, char lastChar) {
        return (firstChar == '(' && lastChar == ')') ||
               (firstChar == '{' && lastChar == '}') ||
               (firstChar == '[' && lastChar == ']');
    }
    
    public static boolean isMatchingBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        for (char currentChar : input.toCharArray()) {
            if (currentChar == '(' || currentChar == '{'|| currentChar == '[') {
                stack.push(currentChar); // push
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (stack.isEmpty() || !isValid(stack.peek(), currentChar)) {
                    return false; // if current char and top of the stack is different or stack is empty, return false
                }
                stack.pop(); // removes the top if valid
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with brackets: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isMatchingBrackets(input)) {
            System.out.println("The brackets are correctly matched.");
        } else {
            System.out.println("The brackets are not correctly matched.");
        }
    }
}