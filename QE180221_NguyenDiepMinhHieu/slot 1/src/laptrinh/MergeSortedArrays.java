package laptrinh;


	public class MergeSortedArrays {
	    public static void main(String[] args) {
	        int[] a = {1, 3, 5, 7, 9};
	        int[] b = {2, 4, 6, 8, 10, 12, 14};

	        int[] c = mergeArrays(a, b);

	        System.out.println("Merged array:");
	        for (int num : c) {
	            System.out.print(num + " ");
	        }
	    }

	    public static int[] mergeArrays(int[] a, int[] b) {
	        int n = a.length;
	        int m = b.length;
	        int[] c = new int[n + m];

	        int i = 0, j = 0, k = 0;

	        while (i < n && j < m) {
	            if (a[i] <= b[j]) {
	                c[k++] = a[i++];
	            } else {
	                c[k++] = b[j++];
	            }
	        }

	        while (i < n) {
	            c[k++] = a[i++];
	        }

	        while (j < m) {
	            c[k++] = b[j++];
	        }

	        return c;
	    }
	}


