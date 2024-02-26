/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _394_decodestring;

import java.util.Stack;

/**
 *
 * @author Tan Luc
 */
public class _394_DecodeString {

    public static String decodeString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ']') {
                //Pop until meet '['
                String loopStr = "";
                while (stack.peek() != '[') {
                    loopStr = stack.pop() + loopStr;
                }
                //Remove '['
                stack.pop();
                //Get number
                String numberString = "";
                while (stack.isEmpty() == false && Character.isDigit(stack.peek()))
                    numberString = stack.pop() + numberString;
                int nLoop  =Integer.parseInt(numberString);
                //Repeat the string
                loopStr = loopStr.repeat(nLoop);
                //Add the result back to the stack
                for (int j = 0; j < loopStr.length(); j++)
                    stack.push(loopStr.charAt(j));
            } else
               stack.push(c);            
        }
        
        String result = "";
        while (stack.isEmpty() == false) {
            result = stack.pop() + result; 
        }
        return result;
    }
    
    public static void main(String[] args) {    
        System.out.println(decodeString("2[abc]"));
    }
    
}
