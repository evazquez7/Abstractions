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
public class Flash extends Superheroes{
    public String flashNumber;

    public String getFlashNumber() {
        return flashNumber;
    }

    public void setFlashNumber(String flashNumber) {
        this.flashNumber = flashNumber;
    }

    @Override
    public void moves() {
        //Different type of moves
    }

    @Override
    public void powers() {
        System.out.println("Speed");
    }
    
    
}
