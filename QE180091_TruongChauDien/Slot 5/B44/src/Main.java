import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, n-1);
        print(a);
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid+1, right);
            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right){
        int len_left = mid-left+1;
        int len_right = right-mid;
        int[] a_left = new int[len_left];
        int[] a_right = new int[len_right];
        for (int i = 0; i < len_left; i++) {
            a_left[i] = a[left+i];
        }
        for (int i = 0; i < len_right; i++) {
            a_right[i] = a[mid+1+i];
        }
        int i = 0;  // vi tri phan tu ben trai
        int j = 0;  // vi tri phan tu ben phai
        int k = left;
        while (i<len_left && j<len_right){
            if (a_left[i]<=a_right[j]){
                a[k] = a_left[i];
                i++;
            } else {
                a[k] = a_right[j];
                j++;
            }
            k++;
        }
        while (i<len_left){
            a[k] = a_left[i];
            i++;
            k++;
        }
        while (j<len_right){
            a[k] = a_right[j];
            j++;
            k++;
        }
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
