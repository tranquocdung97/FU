 
package slot5;
import java.util.Arrays;
import java.util.Scanner;

public class bt45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên dương n
        int n = scanner.nextInt();
        
        // Khai báo mảng a có kích thước n
        int[] a = new int[n];
        
        // Nhập dãy số a từ bàn phím
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Sắp xếp mảng a theo thứ tự không giảm
        Arrays.sort(a);
        
        // In mảng a đã sắp xếp
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            // In khoảng trắng sau mỗi phần tử, trừ phần tử cuối cùng
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }
}

