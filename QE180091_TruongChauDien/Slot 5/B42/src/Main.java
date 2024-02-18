import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i-1;
            while (j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        for (int num :a){
            System.out.print(num+" ");
        }
    }
}
