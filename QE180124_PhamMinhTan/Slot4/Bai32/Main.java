package Bai32;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.addElement(sc, n);
        int target = sc.nextInt();
        int result = linearSearch.run(target);
        System.out.println(result);
        sc.close();
    }
}
