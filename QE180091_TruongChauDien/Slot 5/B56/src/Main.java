import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long k = recursion(Long.parseLong(n));
        System.out.println(k);
    }

    private static long recursion(long n) {
        if (n==1) return 1;
        return 1+recursion(n-(n+1)/2);
    }
}
