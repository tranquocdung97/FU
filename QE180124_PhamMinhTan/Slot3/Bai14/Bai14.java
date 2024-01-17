package Bai14;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ConvertDecToBin convertDecToBin = new ConvertDecToBin();
        convertDecToBin.showResult(n);
        sc.close();
    }
}
