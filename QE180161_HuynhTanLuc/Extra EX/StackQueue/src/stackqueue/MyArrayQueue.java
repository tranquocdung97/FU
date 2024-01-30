/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueue;

/**
 *
 * @author Tan Luc
 */
public class MyArrayQueue implements IStackQueue{
    
    private int[] arr;
    private int SIZE;
    private int headIndex, tailIndex;

    public MyArrayQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        headIndex = tailIndex = -1;
    }
    
    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            arr[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = arr[headIndex];
            headIndex++;
            if (headIndex > tailIndex)
                headIndex = tailIndex = -1;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    public int count() {
        if(isEmpty())
            return 0;
        return tailIndex - headIndex + 1;
    }
    
    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Queue is Empty!!");
        else {
            for(int i = headIndex; i <= tailIndex; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();    
        }
    }
    
}
