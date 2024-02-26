import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[1000];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i< n; i++){
            if(a[i]!=0){
                b[k]= a[i];
                k++;
            }
        }
        quickSort(b, 0, k-1);
        k=0;
        for (int i = n-1; i >=0 ; i--) {
            if (a[i]<0){
                a[i]=b[k];
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i]>0){
                a[i]=b[k];
                k++;
            }
        }
        for (int num : a){
            System.out.print(num+" ");
        }
    }

    private static void quickSort(int[] b, int left, int right) {
        if (left>=right) return;
        int pivot = partition(b, left, right);
        quickSort(b, left, pivot-1);
        quickSort(b, pivot+1, right);
    }

    private static int partition(int[] b, int left, int right) {
        int pivot = b[left];
        int count = 0;
        for (int i = left+1; i<= right; i++){
            if (b[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = left+count;
        swap(b, left, pivotIndex);
        int i = left;
        int j = right;
        while (i<pivotIndex && j>pivotIndex){
            while (b[i]<=pivot){
                i++;
            }
            while (b[j]>pivot){
                j--;
            }
            if (i<pivotIndex && j>pivotIndex){
                swap(b, i, j);
            }
        }
        return pivotIndex;
    }

    private static void swap(int[] b, int x, int y) {
        int temp = b[x];
        b[x] = b[y];
        b[y] = temp;
    }
}
