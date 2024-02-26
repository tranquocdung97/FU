/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueue;


public class MyArrayStack implements IStackQueue{
    private int[] arr;
    private int SIZE;
    private int topIndex;
    
    public MyArrayStack(int size) {
        SIZE = size;
        arr = new int[SIZE];
        topIndex = -1;
    }
    
    @Override
    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            arr[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = arr[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void show() {
        if(isEmpty())
            System.out.println("Stack is Empty!");
        else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    
}
