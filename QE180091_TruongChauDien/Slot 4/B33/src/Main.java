import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int n= sc.nextInt();
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int firstMin = 0;
        int lastMax = a[n-1];
        for (int i = 1; i < n; i++) {
            if (a[i]<a[firstMin]){
                firstMin = i;
            } if (a[i]>=a[lastMax]) {
                lastMax = i;
            }
        }
        int temp = a[firstMin];
        a[firstMin] = a[lastMax];
        a[lastMax] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
