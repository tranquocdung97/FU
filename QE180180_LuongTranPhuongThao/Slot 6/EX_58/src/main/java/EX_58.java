import java.util.Scanner;

public class EX_58 {
    public static void inChuoiNhiPhan(int n, String chuoi) {
        if (chuoi.length() == n) {
            System.out.print(chuoi + " ");
            return;
        }

        inChuoiNhiPhan(n, chuoi + "0");
        inChuoiNhiPhan(n, chuoi + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        if (n < 1) {
            System.out.println("ERROR!");
            return;
        }
        
        inChuoiNhiPhan(n, "");
    }
}