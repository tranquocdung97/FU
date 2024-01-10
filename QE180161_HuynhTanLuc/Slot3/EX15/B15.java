
package b15;

import java.util.Scanner;
import java.util.Stack;

public class B15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "@";
        Stack<Character> stack = new Stack<>();
        StringBuilder compressedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty() || stack.peek() == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                int count = 0;
                compressedString.append(stack.peek());
                while (!stack.empty()){
                    count++;
                    stack.pop();
                }
                compressedString.append(count);
                stack.push(s.charAt(i));
            }
        }
        System.out.println(compressedString);
    }
    
}
