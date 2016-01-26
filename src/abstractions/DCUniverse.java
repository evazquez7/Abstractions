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
public interface DCUniverse {
    public abstract String getCharacter();
    
    public abstract void setCharacter(String characterType);
    
    public void powers();
}
