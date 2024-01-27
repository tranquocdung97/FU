import java.util.Scanner;

public class Main {

    static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        if (a % b == 0) return b;
        return greatestCommonDivisor(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(greatestCommonDivisor(num1, num2));
    }
}
