import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = interporlationSearch(a, x);
        if (index!=-1){
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
    }

    private static int interporlationSearch(int[] a, int x) {
        int low = 0, high = a.length-1;
        while (x >= a[low] && x<= a[high] && a[low]!=a[high]){
            int probe = low+(high - low)*(x-a[low])/(a[high]-a[low]);
            if (a[probe]==x){
                if (probe>0 && a[probe-1]==x){
                    high = probe -1;
                } else {
                    return probe;
                }
            } else if (a[probe]<x) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
            if (a[low]==x){
                return low;
            }
        }
        return -1;
    }
}
