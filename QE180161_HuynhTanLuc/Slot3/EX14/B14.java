
package b14;

import java.util.Scanner;
import java.util.Stack;

public class B14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
    
}
