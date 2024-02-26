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
public class Ex52_P1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int sum = 1;
        int n = 0;
        int k = ip.nextInt();
        if (k <= 0 ){
            System.out.println("Error");
        }else{
            n = 1;
            for(int i = 1 ; i <= k; i++){
                sum = sum*i;
            }
        }
        if ( n !=0 ){
        System.out.println(sum);
    }}
}
