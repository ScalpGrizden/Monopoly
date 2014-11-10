/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rlebail
 */
abstract class CaseAchetable extends Case {
    
    CaseAchetable(String nom, int position, boolean isHypotheque){
        super(nom, position, isHypotheque);
    }
    
    abstract void action(Joueur);
    abstract void acheter(Joueur);
    abstract boolean hypothequer();
    abstract int calcLoyer();
   
}
