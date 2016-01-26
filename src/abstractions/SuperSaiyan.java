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
public abstract class SuperSaiyan implements Character{
    private String characterType;
    
    @Override
    public String getTypeOfCharacter(){
        return characterType;
    }
    
    @Override 
    public void setTypeOfCharacter(String characterType) {
        this.characterType=characterType;
    }
}
