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
public class Players extends Packers{
    public String ranking;

    public Players(String ranking) {
        this.ranking = ranking;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
    
    @Override
    public void positions() {
        //This will display what positions there are. 
    }  

   

  
    
}
