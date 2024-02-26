/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackqueue;

/**
 *
 * @author Tan Luc
 */
public interface IStackQueue {
    public boolean push(int value);
    public int pop();
    public boolean isFull();
    public boolean isEmpty();
    public void show();
}
