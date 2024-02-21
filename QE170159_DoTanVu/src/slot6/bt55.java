 
package slot6;

import java.util.Scanner;

public class bt55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên dương n
        int n = scanner.nextInt();

        // Tìm số Fibonacci thứ n
        int result = fibonacci(n);

        // In kết quả ra màn hình
        System.out.println(result);
    }

    // Hàm đệ quy tìm số Fibonacci thứ n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

