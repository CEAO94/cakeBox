/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cakebox;

/**
 *
 * @author Carlos Eduardo Alves de Oliveira
 */

//Defines the behaviour/standard of the stack methods 
public interface CakeGUI {
    public boolean isEmpty(); //Checks if the stack has any element;
    public boolean isFull(); //Will return false, as ArrayList is dynamic;
    public void push (Object newItem); //Adds new elements to the top of the stack;
    public Object pop (); //Removes the top element and returns it; 
    public Object peek (); //Returns the top element without removing it;
    public int size (); //Check and returns the current number of elements;
    public void emptyStack(); //Removes all elements from the stack;
    public String displayStack (); //Display all elements as a list; 
    
}
