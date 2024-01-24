
package b45;

import java.util.Scanner;

public class B45 {

    public static void shellSort(int[] arr, int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval)
                    arr[j] = arr[j - interval];
                arr[j] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        shellSort(arr, n);
    }
    
}
