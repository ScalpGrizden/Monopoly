/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author avinesse
 */
public class CarteChanceAnniversaire extends CarteChance {
    
public CarteChanceAnniversaire(String t, String d, int a, int pos, boolean prizzoooooon) {
        super (t,a,pos, prizzoooooon);
        
    }
    
public void effect (Joueur j) {
    for (Joueur joueur : j.getPlateau().getListeJoueurs()) 
    {
        joueur.setFortune(joueur.getFortune() - argent);
        j.setFortune(j.getFortune() + argent);
    }
}
    
}
