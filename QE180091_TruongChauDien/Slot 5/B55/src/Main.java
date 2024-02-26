import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = fibo(n);
        System.out.println(k);
    }

    private static int fibo(int n) {
        if (n==1 || n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
