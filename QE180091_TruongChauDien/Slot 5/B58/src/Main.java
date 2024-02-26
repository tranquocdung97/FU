import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n, "");
    }

    private static void recursion(int n, String s) {
        if (n==0) {
            System.out.print(s+" ");
        } else {
            for (int i = 0; i <= 1; i++) {
                recursion(n-1, s+Integer.toString(i));
            }
        }
    }
}
