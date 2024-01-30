/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _20_validparentheses;

import java.util.LinkedList;
import java.util.Stack;

public class _20_ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty())
                    return false;
                char openPeek = myStack.peek();
                if ((c == ')' && openPeek == '(')
                        || (c == '}' && openPeek == '{')
                        || (c == ']' && openPeek == '[')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({)}";
        System.out.println(isValid(s));;
        
    }    

}
