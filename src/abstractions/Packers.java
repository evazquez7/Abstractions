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
public abstract class Packers implements NFL{
    public String colors;
    private String logo;
    private String teamName;
    
     @Override
    public void teamColors() {
         System.out.println("Team colors are Green and Yellow");
    }
      @Override
    public void logo() {
          System.out.println("The team Logo is a G");
    }
    
    @Override
    public void setTeam(String teamName){
        this.teamName= teamName;
    }

    @Override
    public  String getTeams(){
        return teamName;
    }
    

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public abstract void positions(); 
    
    
    
}
