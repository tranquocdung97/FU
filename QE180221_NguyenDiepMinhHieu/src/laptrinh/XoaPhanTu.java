package laptrinh;
import java.util.Scanner;

	public class XoaPhanTu {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số nguyên dương n: ");
	        int n = scanner.nextInt();

	        
	        int[] a = new int[n];

	        
	        System.out.println("Nhập các phần tử của mảng a:");
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	        System.out.print("Nhập số nguyên k (0 ≤ k < n): ");
	        int k = scanner.nextInt();

	      
	        if (k >= 0 && k < n) {
	            for (int i = k; i < n - 1; i++) {
	                a[i] = a[i + 1];
	            }
	            n--; 
	        } else {
	            System.out.println("Chỉ số k không hợp lệ.");
	            System.exit(0);
	        }
       
	        System.out.println("Mảng sau khi xóa phần tử có chỉ số " + k + ":");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }

	        scanner.close();
	    }
	}


