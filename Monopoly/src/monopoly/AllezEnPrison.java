/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author ebriand
 */
public class AllezEnPrison extends Bonus {
    /**
     * Constructeur basique
     */
    public AllezEnPrison() {
        super("Allez en prison", 30);
    }
   /**
    * Envoi le joueur j en Prison
    * @param j 
    */
    @Override
    public void action(Joueur j){
        j.setPosition(10);
        j.setEnPrison(true);
        System.out.println(j.getNom()+ " va en Prison, sans passer par la case Départ.");
    }
    /*
     * Methode toString
     */
    @Override
    public String toString(){
        return "Allez en prison";
    }
            
}
