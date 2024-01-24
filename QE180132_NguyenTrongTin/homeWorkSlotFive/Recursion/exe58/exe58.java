import java.util.Scanner;

public class exe58 {// check lai hen
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        dequy(n, "");
//    }

    public static void dequy(int n, String s) {
        if (n == 0) {
            System.out.print(s + " ");
        } else {
            for (int i = 0; i <= 1; i++) {
                dequy(n - 1, s + Character.toString((char) (i + '0')));
            }
        }
    }
}
