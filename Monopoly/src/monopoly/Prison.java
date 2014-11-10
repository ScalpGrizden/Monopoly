/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;
import java.util.*;

/**
 *
 * @author ebriand / adumas
 */
public class Prison extends Bonus{
    
   /**
    * Constructeur par defaut
    */
    public Prison(){
        super("Prison", 10);
    }
    
    /**
     * Action. Si le joueur est en prison, on tire les des pour savoir s'il sort.
     * Si le joueur est en prison depuis 3 tours, il est libere
     * Si le joueur n'est pas emprisonné, rien ne se passe.
     * @param j 
     */
    @Override
    public void action(Joueur j){
        if (j.getEnPrison() && j.getJourEnPrison()<= 3){
            int de1, de2;
            de1=Joueur.lanceLeDe();
            de2=Joueur.lanceLeDe();
            if(de1==de2){
                j.setEnPrison(false);
                j.setJourEnPrison(0);
                System.out.println("Vous avez fait :"+de1+" : "+de2+"\nVous sortez de prison!");
            }
            else{
                int nbJour =j.getJourEnPrison();
                j.setJourEnPrison(nbJour++);
                System.out.println("Vous avez fait :"+de1+" : "+de2+"\nVous restez en prison!");
            }
        }
        else if (j.getEnPrison() && j.getJourEnPrison() == 3 ){
            j.setEnPrison(false);
            j.setJourEnPrison(0);
            System.out.println("Vous sortez de prison");
        }
        else{
            System.out.println("Vous rendez visite à vos collegues en prison");
        }
    }
}
