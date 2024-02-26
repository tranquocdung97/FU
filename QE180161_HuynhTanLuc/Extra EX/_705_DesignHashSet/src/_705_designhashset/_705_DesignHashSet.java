
package _705_designhashset;

public class _705_DesignHashSet {   
    
    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(1);
        mySet.add(2);
        System.out.println(mySet.contains(1));
        mySet.remove(1);
        System.out.println(mySet.contains(1));
    }
    
}
