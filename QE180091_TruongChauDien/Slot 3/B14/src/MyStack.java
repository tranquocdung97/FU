import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (n!=0){
            int d = n%2;
            stack.push(d);
            n/=2;
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
