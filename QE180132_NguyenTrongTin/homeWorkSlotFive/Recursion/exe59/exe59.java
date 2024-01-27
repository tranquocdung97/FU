
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe59 {//hoán vị//
 
       static boolean[] array = new boolean[11];
       static int[] array2 = new int[11]; 
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//  
//        for (int i = 1; i <= n; i++) {
//            array[i]= true;
//        }
//        recursion(1, n);
//    }
    public static void print(int[] array2, int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(array2[i]);
        }
         System.out.print(" ");
    }
    public static void recursion(int k, int n){
        for(int i =1; i<=n;i++){
            if(array[i]){
                array2[k]= i;
                if(k==n){
                print(array2, n);
            }else{
                    array[i] = false;
                    recursion(k+1, n);
                    array[i] = true;
                }
            }
        }
    }
        
    
}
