package laptrinh;


	import java.util.Scanner;

	public class InsertElement {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        System.out.print("Nhập số phần tử của dãy a: ");
	        int n = scanner.nextInt();  
	        int[] a = new int[n]; 
	        System.out.println("Nhập các phần tử của dãy a:");
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	        // Nhập vị trí k và giá trị x
	        System.out.print("Nhập vị trí k: ");
	        int k = scanner.nextInt();
	        System.out.print("Nhập giá trị x: ");
	        int x = scanner.nextInt();

	        // Kiểm tra điều kiện 0 ≤ k ≤ n
	        if (k < 0 || k > n) {
	            System.out.println("Vị trí k không hợp lệ.");
	            return;
	        }

	     
	        int[] newArray = new int[n + 1];

	       
	        for (int i = 0; i < k; i++) {
	            newArray[i] = a[i];
	        }
	        newArray[k] = x;
	        for (int i = k + 1; i <= n; i++) {
	            newArray[i] = a[i - 1];
	        }

	       
	        System.out.println("Mảng sau khi chèn phần tử x:");
	        for (int i = 0; i < n + 1; i++) {
	            System.out.print(newArray[i] + " ");
	        }

	      
	        scanner.close();
	    }
	}


