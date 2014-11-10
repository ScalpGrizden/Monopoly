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
    
public void effect (Joueur j, Plateau p) {
    for (Joueur joueur : p.getListeJoueurs()) 
    {
        joueur.setFortune(joueur.getFortune() - argent);
        j.setFortune(j.getFortune() + argent);
    }
}
    
}
