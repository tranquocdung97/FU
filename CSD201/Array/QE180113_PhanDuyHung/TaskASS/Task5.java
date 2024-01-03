/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskASS;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Task5 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
                System.out.println("hay nhap so phan tu cua mang");
		int n = ip.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++){
                    System.out.println("hay nhap vao phan tu mang");
                    a[i] = ip.nextInt();
                }
                System.out.println("nhap vao phan tu ma ban muon xoa");
		int k = ip.nextInt();
		if (k>=0 && k<a.length) {
			int b[] = new int[a.length-1];
			for (int i=b.length-1;i>=k;i--)
				b[i]=a[i+1];
			for (int i=k-1;i>=0;i--)
				b[i]=a[i];
			for (int i:b) {
				System.out.print(i + " ");
			}
		} else
			System.out.println("Error");
	}
}
