import java.util.LinkedList;
import java.util.Scanner;
// Nhập vào một số nguyên n, tiếp theo là n số nguyên của một dãy số.
public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            int data = sc.nextInt();
            linkedList.add(data);
        }
        for (int number : linkedList) {
            System.out.print(number + " ");
        }
    }
}
