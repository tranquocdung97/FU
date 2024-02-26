
package _706_designhashmap;

public class _706_DesignHashMap {


    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        myMap.put(1, 1);
        myMap.put(1, 2);
        myMap.put(10, 1);
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(2));
        myMap.remove(1);
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(10));
    }
    
}
