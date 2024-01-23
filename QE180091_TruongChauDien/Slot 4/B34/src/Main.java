import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
