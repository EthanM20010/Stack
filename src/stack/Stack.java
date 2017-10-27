/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.ArrayList;

/**
 *
 * @author emendez
 */
public class Stack  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myStack stack = new myStack();
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Big Pappi");
        myList.add("Daddy T");
        myList.add("Pimp Daddy");
        
        
        for(int i =2; i>=0; i--){
            stack.Push(myList.get(i));
            System.out.println(stack.pop());
    }
        
            
           
            
    }
    
}
