/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b13;

import java.util.*;

public class B13 {
    public static void reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.add(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String str = n.nextLine();
        reverseString(str);
    }
}