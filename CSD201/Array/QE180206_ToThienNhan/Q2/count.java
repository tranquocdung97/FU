package src;

import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        int n;
        int Sum = 0;
        int array[] = new int[50];

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            Sum += array[i];
        }
        System.out.println(Sum);
    }
}
