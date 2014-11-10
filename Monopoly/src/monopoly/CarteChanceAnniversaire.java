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
    
    CarteChanceAnniversaire(String t, String d, int a, int pos, boolean prizzoooooon) {
        super (t,d,a,pos, prizzoooooon);
        
    }
    
public void effect (Joueur j, Plateau p) {
    for (Joueur joueur : p.listeJoueurs) 
    {
        joueur.fortune = joueur.fortune - argent;
        j.fortune = j.fortune + argent;
    }
}
    
}
