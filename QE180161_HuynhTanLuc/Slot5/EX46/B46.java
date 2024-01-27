
package b46;

import java.util.Scanner;

public class B46 {
    
    public static void quickSort(int[] a, int l, int r) {
        if (l >= r)
            return;
        int key = a[(l + r) / 2];
        int k = partition(a, l, r, key);
        quickSort(a, l, k - 1);
        quickSort(a, k, r);        
    }
    
    public static int partition(int[] a, int l, int r, int key) {
        int il = l, ir= r;
        while (il <= ir) {
            while (a[il] < key) il++;
            while (a[ir] > key) ir--;
            if (il <= ir) {
                int tmp = a[il];
                a[il] = a[ir];
                a[ir] = tmp;
                il++;
                ir--;
            }
        }
        return il;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
