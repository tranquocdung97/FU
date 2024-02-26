 
package slot5;

import java.util.Arrays;
import java.util.Scanner;

public class bt41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        // Nhập dãy số a từ bàn phím
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Sắp xếp dãy số a theo thứ tự không giảm
        Arrays.sort(a);
        
        // In dãy số đã sắp xếp ra màn hình
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

