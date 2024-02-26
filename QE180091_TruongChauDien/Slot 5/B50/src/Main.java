import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, n-1);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i==0 && a[i]%Math.sqrt(a[i])==0){
                count++;
                System.out.print(a[i]+" ");
            }
            else if (a[i]%Math.sqrt(a[i])==0 && a[i-1]!=a[i]){
                count++;
                System.out.print(a[i]+" ");
            }
        }
        if (count==0){
            System.out.println("NULL");
        }
    }

    private static void quickSort(int[] a, int left, int right) {
        if (left>=right) return;
        int pivot = partition(a, left, right);
        quickSort(a, left, pivot-1);
        quickSort(a, pivot+1, right);
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = a[left];
        int count = 0;
        for (int i = left+1; i <= right ; i++) {
            if (a[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = left+count;
        swap(a, left, pivotIndex);
        int i = left;
        int j = right;
        while (i<pivotIndex && j>pivotIndex){
            while (a[i]<=pivot){
                i++;
            }
            while (a[j]>pivot){
                j--;
            }
            if (i<pivotIndex && j>pivotIndex){
                swap(a, i, j);
            }
        }
        return pivotIndex;
    }

    private static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
