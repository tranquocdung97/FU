
package Slot2;

import java.util.Scanner;
import java.util.Stack;

public class bt13 {
    public static String reverseString(String input) {
        // Khoi tao mot Stack de luu tru cac ky tu cua chuoi
        Stack<Character> stack = new Stack<>();

        // Day tung ky tu cua chuoi vao Stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Tao mot StringBuilder de xay dung chuoi dao nguoc
        StringBuilder reversed = new StringBuilder();

        // Pop cac ky tu tu Stack de tao chuoi dao nguoc
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Tra ve chuoi dao nguoc
        return reversed.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

		System.out.println(reverseString(input));
	
	}
}
