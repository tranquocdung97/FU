/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char i: str.toCharArray()){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
