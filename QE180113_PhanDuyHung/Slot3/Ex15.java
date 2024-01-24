/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author HUNG
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap vao chuoi: ");
        String s = ip.nextLine();
        s = s + "@";
        Stack<Character> st = new Stack<>();
        String str = " ";
        for (int i = 0; i < s.length(); i++) {
            if (st.empty() || st.peek() == s.charAt(i)) {
                st.push(s.charAt(i));
            } else {
                int count = 0;
                str = str + st.peek();
                while (!st.empty()) {
                    count++;
                    st.pop();
                }
                str = str + Integer.toString(count);
                st.push(s.charAt(i));
            }
        }
        System.out.println(str);
    }
}
