/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cakebox;

/**
 *
 * @author carlo
 */
public interface CakeGUI {
    public boolean isEmpty();
    public boolean isFull();
    public void push (Object newItem);
    public Object pop ();
    public Object peek ();
    public int size ();
    public void emptyStack();
    public String displayStack ();
    
}
