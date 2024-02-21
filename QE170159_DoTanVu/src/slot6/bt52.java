 
package slot6;
import java.util.Scanner;

public class bt52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Nhập số tự nhiên n

        // Gọi hàm đệ quy để tính giai thừa của n
        long factorial = calculateFactorial(n);

        // In kết quả ra màn hình
        System.out.println(factorial);
    }

    // Hàm đệ quy tính giai thừa của n
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Quy ước 0! = 1
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
