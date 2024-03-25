import java.util.Scanner;

public class Main {

    static void recursion(int n, String s) {
        if (n == 0) {
            System.out.print(s + " ");
        } else {
            for (int i = 0; i <= 1; i++) {
                recursion(n - 1, s + Character.toString((char) (i + '0')));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recursion(n, "");
    }
}
