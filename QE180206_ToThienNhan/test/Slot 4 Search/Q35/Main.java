package src;

import java.util.Scanner;

/*      Hãy in ra những phần tử lẻ ở chỉ số chẵn, sau mỗi phần tử có đúng một dấu cách,
        nếu không có phần tử nào thõa mãn thì in ra "NULL".
*/
/* even odd
index:  0 1 2 3 4 5
input:  1 2 3 4 5 6
output: 1   3   5
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int arr[] = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt ();
        }

        oddElementAtEvenIndex (arr, n);
    }

    public static void oddElementAtEvenIndex(int[] arr, int n) {
        boolean check = true;
        int value = 0;
        for (int i = 0; i < n; i++) {
            value = arr[i];
            if ((value % 2 != 0) && (i % 2 == 0)) {
                System.out.print (arr[i] + " ");
                check = false;
            }
        }
        if (check) {
            System.out.print ("NULL");
        }

    }
}
