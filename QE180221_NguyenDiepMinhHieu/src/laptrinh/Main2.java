package laptrinh;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhập số hàng (m): ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột (n): ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];

    
        System.out.println("Nhập các phần tử của mảng a:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
    
        int tong = tinhTongPhanTuMang(a);

       
        System.out.println("Tổng của tất cả các phần tử trong mảng là: " + tong);
    }

    public static int tinhTongPhanTuMang(int[][] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tong += arr[i][j];
            }
        }
        return tong;
    }
}
