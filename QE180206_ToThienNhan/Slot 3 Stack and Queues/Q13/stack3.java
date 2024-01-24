package src3;

import java.util.Scanner;
import java.util.Stack;

public class stack3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();

        reverseString(name, stack);

        popString(name, stack);

    }
    private static void reverseString(String name, Stack<Character> stack) {
        for (int i = 0; i < name.length(); i++){
            stack.push(name.charAt(i));
        }
    }

    private static void popString(String name, Stack<Character> stack) {
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
