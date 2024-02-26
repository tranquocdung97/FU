import java.util.Scanner;

public class Main {
    private static int count=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        recursion(n, k);
        System.out.println(count);
    }

    private static void recursion(int n, int k) {

        if (k==0) {
            count++;
        } else {
            recursion(n*2, k-1);
            if ((n-1)%3==0 && ((n-1)/3)%2==1){
                recursion((n-1)/3, k-1);
            }
        }

    }
}
