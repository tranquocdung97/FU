
package b38;

import java.util.Scanner;

public class B38 {
    
    public static int interpolationSearch(int[] arr, int n, int x) {
        int l = 0, r = n - 1;
        while (arr[l] != arr[r] && x >= arr[l] && x <= arr[r]) { {            
            int mid = l + (r-l) * (x-arr[l]) / (arr[r]-arr[l]);
            if (arr[mid] < x)
                l = mid + 1;
            else if (arr[mid] > x)
                r = mid -1;
            else {
                if (mid > 0 && arr[mid-1] == x)
                    r = mid -1;
                else
                    return mid;
            }
        }
        if (arr[l] == x)
            return l;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(interpolationSearch(arr, n, x));
    }
    
}
