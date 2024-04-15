import java.util.Scanner;

class CustomStack {
    private char[] stackArray;
    private int top;

    public CustomStack(int capacity) {
        stackArray = new char[capacity];
        top = -1;
    }

    public void push(char bracket) {
        stackArray[++top] = bracket;
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class BalancedBrackets {

    public static boolean isBalanced(String str) {
        CustomStack stack = new CustomStack(str.length());

        for (char bracket : str.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                        (bracket == ']' && top != '[') ||
                        (bracket == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with brackets:");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("Brackets are balanced.");
        } else {
            System.out.println("Brackets are not balanced.");
        }
    }
}
