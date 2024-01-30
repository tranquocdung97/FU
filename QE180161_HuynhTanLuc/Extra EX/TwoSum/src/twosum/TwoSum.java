/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twosum;

/**
 *
 * @author Tan Luc
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        int index = 1;
        while (index < nums.length) {
            for (int i = 0; i + index < nums.length; i++) {
                if (nums[i] + nums[i + index] == target) {
                    b[0] = i;
                    b[1] = i + index;
                    return b;
                }    
            }
            index++;
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
