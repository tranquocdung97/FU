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
public class Ex53 {
    public static int luythua(int k, int a){
        if(k == 0 || a==0) return 1;
        return k * luythua(k,a-1);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        int a = ip.nextInt();
        luythua(k,a);
        System.out.println(luythua(k,a));
    }
}
