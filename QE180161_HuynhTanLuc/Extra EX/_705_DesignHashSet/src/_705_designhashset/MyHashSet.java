
package _705_designhashset;

import java.util.ArrayList;


public class MyHashSet {
    
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];
    
    public MyHashSet() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }
    
    //return hashValue
    private int hashFunction(int key) {
        return key % SIZE;
    }
    
    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex =  bucket.indexOf(key);
        
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex =  bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }        
    }
    
    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex =  bucket.indexOf(key);
        return keyIndex >= 0;
    }
}
