package src;


import java.util.Scanner;

/*Nhập và số nguyên dương n, tiếp theo là n số nguyên lần lượt là các phần tử trong dãy a,
        cuối cùng là nhập số nguyên x, hãy đếm xem trong dãy a có bao nhiêu phần tử có giá trị bằng x.
        In ra số đó.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int arr[] = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt ();
        }

        int x = scanner.nextInt ();
        int result = countSameNumber (n, arr, x);
        System.out.println (result);
    }

    public static int countSameNumber(int n, int[] arr, int x) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                k++;
            }
        }
        return k;
    }
}
