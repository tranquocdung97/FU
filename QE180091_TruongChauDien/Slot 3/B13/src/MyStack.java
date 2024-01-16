import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
