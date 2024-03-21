import java.util.Scanner;

public class EX_55 {
    public static int timFibonacci(int n) {
        if (n <= 1) return n;
        return timFibonacci(n - 1) + timFibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("ERROR!");
            return;
        }
        
        int fibonacci = timFibonacci(n);
        System.out.println("So Fibonacci thu " + n + " : " + fibonacci);
    }
}