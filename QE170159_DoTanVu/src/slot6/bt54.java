 
package slot6;

import java.util.Scanner;

public class bt54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Tìm ước chung lớn nhất của a và b
        int gcd = findGCD(a, b);

        // In kết quả ra màn hình
        System.out.println(gcd);
    }

    // Hàm tìm ước chung lớn nhất của hai số nguyên a và b
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
