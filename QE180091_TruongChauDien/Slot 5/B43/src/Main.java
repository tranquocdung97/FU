import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length-1; i++) {
            int Min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[Min]){
                    Min = j;
                }
            }
            int temp = a[i];
            a[i] = a[Min];
            a[Min] = temp;
        }
        for (int num : a){
            System.out.print(num+" ");
        }
    }
}
