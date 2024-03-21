import java.util.Scanner;

public class EX_54 {
    public static int timUCLN(int a, int b) {
        if (b == 0) return a;
        return timUCLN(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        
        int ucln = timUCLN(a, b);
        System.out.println("UCLN " + a + " và " + b + " : " + ucln);
    }
}