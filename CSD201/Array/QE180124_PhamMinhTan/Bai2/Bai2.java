import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            sc.nextLine();
            sum += x[i];
        }
        System.out.println(sum);
    }
}