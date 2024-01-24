/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;
import java.util.*;
/**
 *
 * @author HUNG
 */
public class Ex14_P1 {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số: ");
        int num = ip.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("Giá trị nhị phân là: ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
    }
}