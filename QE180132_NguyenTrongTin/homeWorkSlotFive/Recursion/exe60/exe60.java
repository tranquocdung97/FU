
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe60 {//tổ hợp//
    
    static int[] array = new int[11];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        array[0]=0; 
        recursion(1, k, n);
    }
    public static void recursion(int h, int k, int n){
        for(int i = array[h-1]+1; i<=n-(k-h);i++){
            array[h] = i;
            if(h==k){
                print(array, k);
        }else{
                recursion(h+1, k, n);
                }
        }
    }
    public static void print(int array[], int k){
        for (int i = 1; i <= k; i++) {
            System.out.print(array[i]);
        }
        System.out.print(" ");
    }  
}


//import java.util.Scanner;
//
//public class exe60 {
//    static int[] x = new int[11];
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int k = input.nextInt();
//        x[0] = 0;
//        dequy(1, k, n);
//    }
//
//    public static void dequy(int h, int k, int n) {
//        for (int i = x[h - 1] + 1; i <= n - (k - h); i++) {
//            x[h] = i;
//            if (h == k) {
//                printArray(x, k);
//            } else {
//                dequy(h + 1, k, n);
//            }
//        }
//    }
//
//    public static void printArray(int a[], int k) {
//        for (int i = 1; i <= k; i++) {
//            System.out.print(a[i]);
//        }
//        System.out.print(" ");
//    }
//}
