/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author evazquez7
 */
public abstract class Superheroes implements DCUniverse{
    public String type;

    @Override
    public String getCharacter(){
        return type;
    }
    
    @Override 
    public void setCharacter(String type) {
        this.type=type;
    }
   
    public abstract void moves();
    
}
