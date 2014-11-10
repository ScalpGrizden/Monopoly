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
     * Si le joueur n'est pas emprisonné, rien ne se passe.
     * @param j 
     */
    public void action(Joueur j){
        if (j.getEnPrison() && j.getNbJoursEnPrison()<= 3){
            int de1, de2;
            de1=Plateau.LanceLeDe();
            de2=Plateau.LanceLeDe();
            if(de1==de2){
                j.setEnPrison(false);
                j.setNbJoursEnPrison(0);
                System.out.println("Vous avez fait :"+de1+" : "+de2+"\nVous sortez de prison!");
            }
            else{
                j.setNbJoursEnPrison(j.getNbJoursEnPrison()++);
                System.out.println("Vous avez fait :"+de1+" : "+de2+"\nVous restez en prison!");
            }
        }
        else{
            System.out.println("Vous rendez visite à vos collegues en prison");
        }
    }
}
