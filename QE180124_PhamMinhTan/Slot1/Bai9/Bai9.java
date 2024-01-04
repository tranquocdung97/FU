import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        sc.nextLine();
        int [] a1 = new int[n1];
        addElementForArray (a1, sc);
        n2 = sc.nextInt();
        sc.nextLine();
        int[] a2 = new int[n2];
        addElementForArray(a2, sc);
        int[] total = new int[n1+n2];
        a1CombineA2 (a1, a2, total);
        result(total);
        printResult (total);
    }

    private static void printResult(int[] total) {
        for (int element:total) {
            System.out.print(element + " ");
        }
    }

    private static int[] result(int[] total) {
        for (int i = 0; i<total.length; i++) {
            for (int j = 0 ; j < total.length-1; j++) {
                if (total[j] > total[j+1]) {
                    swapNum(total, j, j+1);
                }
            }
        }
        return total;
    }

    private static int[] swapNum(int[] total, int j, int j1) {
        int temp;
        temp = total[j];
        total[j] = total[j1];
        total[j1] = temp;
        return total;
    }

    private static int[] a1CombineA2(int[] a1, int[] a2, int[] total) {
        int j = 0;
        for (int i = 0; i < a1.length; i++) {
            total[j] = a1[i];
            j++;
        }
        for (int i = 0 ; i<a2.length; i++) {
            total[j] = a2[i];
            j++;
        }
        return total;
    }


    private static int[] addElementForArray(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
