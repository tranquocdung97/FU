import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count =0;
        for (int i=0; i<n; i+=2){
            if (a[i]%2!=0){
                System.out.print(a[i]+" ");
                count++;
            }
        }
        if (count==0){
            System.out.println("NULL");
        }
    }
}
