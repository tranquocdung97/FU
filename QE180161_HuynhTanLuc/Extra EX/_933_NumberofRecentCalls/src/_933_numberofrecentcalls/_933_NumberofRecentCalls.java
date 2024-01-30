/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _933_numberofrecentcalls;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Tan Luc
 */
public class _933_NumberofRecentCalls {
    
    private Queue<Integer> myQueue = new LinkedList<>();
    public int ping(int t) {
        myQueue.add(t);
        while (myQueue.peek() < (t - 3000))
            myQueue.remove();
        return myQueue.size();
    }
    
    public static void main(String[] args) {
        
    }
    
}
