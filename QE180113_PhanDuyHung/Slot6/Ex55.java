/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot6;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex55 {
    public static int fibonaci(int k){
        if(k == 1 || k == 2){
            return 1;
        }
        return fibonaci(k-1) + fibonaci(k-2);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        if (k <= 0 ){
            System.out.println("Error");}
        else{
            System.out.println(fibonaci(k));
    }
}
}
