import java.util.Scanner;

public class EX_52 {
    public static long giaiThua(int n) {
        if (n == 0) return 1;
        return n * giaiThua(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n (n <= 20): ");
        int n = sc.nextInt();
        
        if (n < 0 || n > 20) {
            System.out.println("ERROR!");
            return;
        }
        long result = giaiThua(n);
        System.out.println(n + "! = " + result);
    }
}