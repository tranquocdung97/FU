
package b74;

import java.util.Scanner;

public class B74 {

    public static void printArray(int[] arr, int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                l[i] = l[i - 1] + 1;
            else
                l[i] = 1;
        }
        int indexMax = 0;
        for (int i = 0; i < n; i++) {
            if (l[indexMax] < l[i])
                indexMax = i;
        }
        printArray(arr, indexMax - l[indexMax] + 1, indexMax);
    }
    
}
