
package _217_containsduplicate;

import java.util.HashSet;
import java.util.Set;


public class _217_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        
        Set<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            if (mySet.contains(i))
                return true;
            else 
                mySet.add(i);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 2};
        System.out.println(containsDuplicate(nums));
    }
    
}
