
import java.util.ArrayList;
import java.util.Scanner;

public class exe51 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i]=input.nextInt();
//        }
//        int[] arraytwo = new int[100001];
//        int k=0;
//        for (int i = 0; i < n; i++) {
//            if(array[i]!=0){
//                arraytwo[k]=array[i];
//                k-=-1;
//            }
//        }
//        quickSort(arraytwo, 0, k-1);
//         k=0;
//        for(int i=n-1;i>=0;i--){
//            if(array[i]<0){
//                array[i]=arraytwo[k];
//                k-=-1;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(array[i]>0){
//                array[i]=arraytwo[k];
//                k-=-1;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i]+" ");
//        }
//    }

        public static void quickSort(int[] array, int l, int r){
       int i=l;int j=r;
       int p = array[(l+r)/2];
       while(i<j){
           while(array[i]<p){
               i++;
           }
           while(array[j]>p){
               j--;
           }
           if(i<=j){
               int hold = array[i];
               array[i] = array[j];
               array[j] = hold;
               i++;
               j--;
           }
       }
       if(i<r){  
           quickSort(array, i, r);
       }
       if(l<j){
           quickSort(array, l, j);
       }
    }   
    
}



//import java.util.ArrayList;
//import java.util.Scanner;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author MY MSI
// */
//public class exe51 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i]=input.nextInt();
//        }
//        ArrayList<Integer> newArray = new ArrayList<>();
//        int k=0;
//        for (int i = 0; i < n; i++) {
//            if(array[i]!=0){
//                newArray.add(array[i]);
//                k++;
//            }
//        }
//        int[]arraytwo = new int[newArray.size()];
//        for (int i = 0; i < newArray.size(); i++) {
//            arraytwo[i]=newArray.get(i);
//        }
//        quickSort(arraytwo, 0, arraytwo.length-1);
//         k=0;
//        for(int i=n-1;i>=0;i--){
//            if(array[i]<0){
//                array[i]=arraytwo[k];
//                k++;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(array[i]>0){
//                array[i]=arraytwo[k];
//                k++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i]+" ");
//        }
//    }
//
//        public static void quickSort(int[] array, int l, int r){
//       int i=l;int j=r;
//       int p = array[(l+r)/2];
//       while(i<j){
//           while(array[i]<p){
//               i++;
//           }
//           while(array[j]>p){
//               j--;
//           }
//           if(i<=j){
//               int hold = array[i];
//               array[i] = array[j];
//               array[j] = hold;
//               i++;
//               j--;
//           }
//       }
//       if(i<r){  
//           quickSort(array, i, r);
//       }
//       if(l<j){
//           quickSort(array, l, j);
//       }
//    }   
//    
//}
