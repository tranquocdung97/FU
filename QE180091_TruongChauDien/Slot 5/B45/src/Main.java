import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = shellSort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }

    private static int[] shellSort(int[] a) {
        for (int interval = a.length/2; interval>=1; interval/=2){
            for (int i = interval; i < a.length; i++) {
                int j = i;
                int value = a[j];
                for (j = i; j>=interval && a[j-interval]>value; j-=interval){
                    a[j] = a[j-interval];
                }
                a[j] = value;
            }
        }
        return a;
    }
}
