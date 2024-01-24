
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        shellSort(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void shellSort(int[] array, int n){
        int interval, i,j,temp;
        for(interval =n/2; interval>0;interval /=2){
          for(i = interval;i<n;i++){
              temp =array[i];
              for(j=i;j >= interval && array[j - interval] > temp;j -=interval){
                  array[j] = array[j-interval];
              }
              array[j] = temp;
          }
    }
    }
}
