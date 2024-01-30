
package b58;

import java.util.Scanner;

public class B58 {

    private static void binaryString(int n, String s) {
        if (n == 0) {
            System.out.print(s + " ");
            return;
        }

        binaryString(n - 1, s + "0");
        binaryString(n - 1, s + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binaryString(n, "");
    }
    
}
