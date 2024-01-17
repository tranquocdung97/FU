package Bai13;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialStr = sc.nextLine();
        ReverseStringStack reverseStringStack = new ReverseStringStack(initialStr.length());
        String reversedString = reverseStringStack.reverseString(initialStr);
        System.out.println(reversedString);
        sc.close();
    }
}
