import java.util.Scanner;

public class Main {

    static int gameGuessNumber(long n) {
        if (n == 1) return 1;
        return 1 + gameGuessNumber(n - (n + 1) / 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(gameGuessNumber(n));
    }
}
