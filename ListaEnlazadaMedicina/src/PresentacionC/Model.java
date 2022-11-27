/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PresentacionC;


import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author marilyn
 */
public class Model extends Observable{
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        refresh();
        
    }
    
    private void refresh(){
        setChanged();
        notifyObservers();
    }
    
    
}
