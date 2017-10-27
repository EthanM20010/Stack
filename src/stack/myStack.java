package stack;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emendez
 */
public class myStack<T> {
   private ArrayList<T> lister = new ArrayList<>();
    
            public void Push(T myS){
        lister.add(myS);
    }
    
    public T pop(){
        
        T stringCheese=lister.get(lister.size()-1);
        lister.remove(lister.size()-1);
    
        return stringCheese;
    }
  
       
       
       
       
   
   
}
