
package slot4;
import java.util.Scanner;

public class bt32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhap so nguyen duong n
        int n = scanner.nextInt();
        
        // Khoi tao mang a co kich thuoc n
        int[] arr = new int[n];
        
        // Nhap day so nguyen a
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Nhap so nguyen x
        int x = scanner.nextInt();
        
        // Tim chi so cua phan tu dau tien co gia tri bang x
        int result = findIndexOfX(arr, x);
        
        // In ket qua
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int findIndexOfX(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
