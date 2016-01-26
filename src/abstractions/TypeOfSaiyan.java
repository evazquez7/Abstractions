package abstractions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evazquez7
 */
public class TypeOfSaiyan extends SuperSaiyan {
    String SuperSaiyan;
    
    @Override
    public void powerLevel() {
        System.out.println("You are at SuperSaiyan Level. ");
    }
    public void SignatureMoves() {
        //depending on the SuperSaiyan each one has different signature moves. 
    }
}
