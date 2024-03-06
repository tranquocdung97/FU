import java.util.Scanner;

public class EX_53 {
    public static long tinhMu(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            long half = tinhMu(a, b/2);
            return half * half;
        } else {
            long half = tinhMu(a, b/2);
            return half * half * a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        
        long result = tinhMu(a, b);
        System.out.println(a + "^" + b + " = " + result);
    }
}