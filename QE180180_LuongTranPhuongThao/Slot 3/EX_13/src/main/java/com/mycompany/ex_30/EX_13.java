/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_30;

/**
 *
 * @author LENOVO
 */
import java.util.Stack;

public class EX_13 {
    public static void main(String[] args) {
        String input = "code";
        String reversedString = reverseString(input);
        System.out.println(reversedString);
    }
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}