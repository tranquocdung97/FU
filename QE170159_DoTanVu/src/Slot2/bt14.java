
package Slot2;
import java.util.Scanner;
import java.util.Stack;

public class bt14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(n);
    }

    public static void printN(int n){
        Stack<Integer> stack = new Stack<>();
        while(n > 0){
            stack.push(n % 2);
            n = n/2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
