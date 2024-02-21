package src2;

import java.util.Scanner;
import java.util.Stack;

public class Binary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int replace;
        int[] array = new int[10000];
        Stack<Integer> stack = new Stack<>();

        reverseBinary(number, array, stack);


        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }

    public static void reverseBinary(int number, int[] array, Stack<Integer> stack) {
        int total = 0;
        int i = 0;
        while(number>0){
            total = number%2;

            array[i] = total;
            stack.push(array[i]);

            number/=2;
            i++;
        }
    }
}
