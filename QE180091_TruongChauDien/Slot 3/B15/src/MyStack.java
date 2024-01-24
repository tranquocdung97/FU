import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + '@';
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if (stack.isEmpty() || stack.peek()==s.charAt(i)){
                stack.push(s.charAt(i));
            } else {
                int count=0;
                result.append(stack.peek());
                while (!stack.isEmpty()){
                    count++;
                    stack.pop();
                }
                result.append(count);
                stack.push(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
