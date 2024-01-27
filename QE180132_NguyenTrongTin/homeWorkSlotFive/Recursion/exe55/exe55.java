
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe55 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.print(recursion(n));
//    }
    public static int recursion(int n){
       if(n==1 || n==2)
           return 1; 
       return recursion(n-1)+ recursion(n-2);
     }
}  
