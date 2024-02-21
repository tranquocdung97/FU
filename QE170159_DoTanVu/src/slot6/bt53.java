 
package slot6;
import java.util.Scanner;

public class bt53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số tự nhiên a và b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Tính giá trị của a^b
        long result = power(a, b);

        // In kết quả ra màn hình
        System.out.println(result);
    }

    // Hàm tính lũy thừa a^b
    public static long power(int a, int b) {
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
