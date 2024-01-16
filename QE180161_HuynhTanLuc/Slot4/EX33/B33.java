
package b33;

import java.util.Scanner;

public class B33 {

    public static int searchMin(int[] arr, int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[k] > arr[i])
                k = i;
        }
        return k;
    }
    
    public static int searchMax(int[] arr, int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[k] <= arr[i])
                k = i;
        }
        return k;
    }
    
    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int indexMin = searchMin(arr, n);
        int indexMax = searchMax(arr, n);
        swap(arr, indexMin, indexMax);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
   
    }   
}
