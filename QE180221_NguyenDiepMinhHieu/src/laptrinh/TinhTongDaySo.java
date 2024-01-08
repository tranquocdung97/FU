package laptrinh;

	import java.util.Scanner;
	public class TinhTongDaySo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Nhập vào số nguyên dương n: ");
	        int n = scanner.nextInt();

	        
	        int[] a = new int[n];

	      
	        System.out.println("Nhập vào các phần tử của dãy a:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("a[" + i + "]: ");
	            a[i] = scanner.nextInt();
	        }

	       
	        int tong = 0;
	        for (int i = 0; i < n; i++) {
	            tong += a[i];
	        }

	       
	        System.out.println("Tổng các phần tử trong dãy là: " + tong);
	    }
	}


