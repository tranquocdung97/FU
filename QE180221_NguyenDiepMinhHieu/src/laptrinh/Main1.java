package laptrinh;
import java.util.Scanner;
public class Main1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt();	       
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }

	        
	        String result = isMonotonic(a) ? "YES" : "NO";

	        
	        System.out.println(result);
	    }

	    public static boolean isMonotonic(int[] arr) {
	        boolean increasing = true;
	        boolean decreasing = true;

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > arr[i - 1]) {
	                decreasing = false;
	            } else if (arr[i] < arr[i - 1]) {
	                increasing = false;
	            }
	        }

	        return increasing || decreasing;
	    }
}
