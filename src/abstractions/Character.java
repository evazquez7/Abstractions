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
public interface Character {
    public abstract String getTypeOfCharacter();
    
    public abstract void setTypeOfCharacter(String characterType);
    
    public abstract void powerLevel();
}
