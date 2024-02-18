import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = recursion(a, b);
        System.out.println(k);
    }

    private static int recursion(int a, int b) {
        if (b==0){
            return 1;
        }
        return a*recursion(a, --b);
    }
}
