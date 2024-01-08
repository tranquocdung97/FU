package laptrinh;


	import java.util.Scanner;

	public class PrimeNumbersInArray {
	    static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Nhập vào số nguyên dương n: ");
	        int n = scanner.nextInt();

	       
	        int[] a = new int[n];
	        System.out.println("Nhập vào các phần tử của dãy a:");
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	        
	        System.out.println("Các số nguyên tố trong dãy a là:");
	        for (int i = 0; i < n; i++) {
	            if (isPrime(a[i])) {
	                System.out.print(a[i] + " ");
	            }
	        }

	        scanner.close();
	    }
	}

