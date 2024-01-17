
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[1001];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        boolean check = true;
        for (int i = 0; i < 10; i++) {
            if(i %2 ==0 && array[i] %2 ==1){
                System.out.print(array[i]+" ");
                check=false;
            }
        }
        if(check)
            System.out.print("NULL");
    }
}
