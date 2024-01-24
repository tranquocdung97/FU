
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        mergeSort(array, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] +" ");
        }
    }
    public static void merge(int[]array, int l, int m, int r){
        int i,j,k;
        int n1= m-l+1;
        int n2= r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int n = 0; n < n1; n++) {
            L[n] = array[l+n];
        }
        for (int n = 0; n < 10; n++) {
            R[n] = array[m+1+n];
        }
        i =0;
        j=0;
        k=l;
        while(i <n1 && j < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
           k++;
        }
        while(i < n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j <n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int a[], int l, int r){
        if( l< r){
            int m = +(r-1)/2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }

}
//import java.util.Scanner;
//
//public class exe44 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = input.nextInt();
//        }
//        mergeSort(array, 0, n-1);
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//          }
//    }
//
//    public static void merge(int[] array, int l, int m, int r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        int[] L = new int[n1];
//        int[] R = new int[n2];
//
//        for (int i = 0; i < n1; i++) {
//            L[i] = array[l + i];
//        }
//
//        for (int j = 0; j < n2; j++) {
//            R[j] = array[m + 1 + j];
//        }
//
//        int i = 0, j = 0, k = l;
//
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                array[k] = L[i];
//                i++;
//            } else {
//                array[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < n1) {
//            array[k] = L[i];
//            i++;
//            k++;
//        }
//
//        while (j < n2) {
//            array[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void mergeSort(int[] a, int l, int r) {
//        if (l < r) {
//            int m = l + (r - l) / 2;
//            mergeSort(a, l, m);
//            mergeSort(a, m + 1, r);
//            merge(a, l, m, r);
//        }
//    }
//}
