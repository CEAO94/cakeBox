/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakebox;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Carlos Eduardo Alves de Oliveira
 */

//Implements the Stack using an ArrayList and controls how cakes are added, viewd and removed using Stack logic. 
public class MyCakes implements CakeGUI {

    //ArrayList is flexible in size, but the behavior is controlled to Stack principles. 
    private ArrayList<String> theOven;

    public MyCakes() {
        theOven = new ArrayList<String>();
    }

   public int size(){
        return theOven.size();

    }
    public boolean isEmpty()
    {
        return theOven.isEmpty();
    }

    /** always false as there is no limit on the size of this ArrayList based stack */
    public boolean isFull()
    {
        return false;
    }

    /** removes the item  from the top of the stack and returns it */
    public Object pop()
    {
        if (!(theOven.isEmpty()))
        {
             return theOven.remove(0);
        }
        else
		return null;
    }


    /** puts an item onto the top of the stack */
    public void push(Object newItem)
    {
          theOven.add(0, (String)newItem);

    }

    /** puts an item onto the top of the stack */
    public Object peek()
    {
          return theOven.get(0);
    }

    // removes all elements from the stack
    public void emptyStack()
    {
        while (!theOven.isEmpty())
        {
            pop();
        }
    }

   // return a String object that consists of all elements from the stack
   public String displayStack()
   {
       Iterator it;
       String str = new String() ;
       it = theOven.iterator();
       if(theOven.isEmpty())
       {
           str = str.concat("OVEN IS EMPTY!");
       }
       else
       {
            while (it.hasNext()){
                str = str.concat((String)it.next());
                str = str.concat(";");
           }
       }
       return str;
   }

}
    

