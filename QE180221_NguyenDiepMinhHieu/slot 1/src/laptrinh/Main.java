package laptrinh;

	import java.util.Scanner;
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
  
	        System.out.print("Nhập vào số nguyên dương n: ");
	        int n = scanner.nextInt();

	      
	        int[] a = new int[n];

	       
	        System.out.println("Nhập vào các phần tử của mảng a:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử thứ " + (i + 1) + ": ");
	            a[i] = scanner.nextInt();
	        }
  
	        for (int i = 0; i < n; i++) {
	            a[i] = a[i] * a[i];
	        }

	      
	        System.out.print("Mảng sau khi thay đổi: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }

	        scanner.close();
	    }
	}


