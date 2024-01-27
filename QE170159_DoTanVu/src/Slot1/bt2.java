<<<<<<< HEAD
package Slot1;

import java.util.Scanner;
public class bt2 {

=======

package Slot1;

import java.util.Scanner;

public class bt2 {
>>>>>>> cbdbd624963f7b9c80f7ce72172b7dfb9bcb4393
    public static void main(String[] args) {
        int n;
        int a[] = new int[101];

        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
=======
        n = scanner.nextInt(); //Lenh nhap gia tri cua n tu ban phim.
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt(); // Nhap cac phan tu trong day.
>>>>>>> cbdbd624963f7b9c80f7ce72172b7dfb9bcb4393
        }
        int Sum = 0;
        for (int i = 0; i < n; i++){
            Sum += a[i];
        }
        System.out.print(Sum);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> cbdbd624963f7b9c80f7ce72172b7dfb9bcb4393
