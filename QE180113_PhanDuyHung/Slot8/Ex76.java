/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot8;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex76 {
	public static int chooseGifts(int[] arr) {
		int[][] dp = new int[arr.length][2];

		for (int i = 0; i < arr.length; i++) {
			dp[i][0] = arr[i];
			dp[i][1] = -1;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i] && dp[j][0] + arr[i] > dp[i][1]) {
					dp[i][1] = dp[j][0] + arr[i];
				}
			}

			for (int j = 0; j < i; j++) {
				if (dp[j][1] + arr[i] > dp[i][0]) {
					dp[i][0] = dp[j][1] + arr[i];
				}
			}
		}

		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (dp[i][j] > max) {
					max = dp[i][j];
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		System.out.println(chooseGifts(arr));
		scanner.close();
	}
}
