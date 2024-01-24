package src;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static String convertToString(long n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.insert(0, (char) (n % 10 + '0'));
            n /= 10;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input + '@';
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (stack.isEmpty() || stack.peek() == input.charAt(i)) {
                stack.push(input.charAt(i));
            } else {
                int count = 0;
                result.append(stack.peek());
                while (!stack.isEmpty()) {
                    count++;
                    stack.pop();
                }
                result.append(convertToString(count));
                stack.push(input.charAt(i));
            }
        }
        System.out.println(result);
    }
}
