import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = giaiThua(n);
        System.out.println(k);
    }

    private static long giaiThua(int n) {
        if (n==0){
            return 1;
        }
        return n*giaiThua(n-1);
    }
}
