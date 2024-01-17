import java.util.Scanner;

public class Main {

    static int count = 0;

    static void convert(int n, int k) {
        if (k == 0) {
            count++;
        } else {
            convert(2 * n, k - 1);
            if ((n - 1) % 3 == 0 && ((n - 1) / 3) % 2 == 1) {
                convert((n - 1) / 3, k - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        convert(n, k);
        System.out.println(count);
    }
}
