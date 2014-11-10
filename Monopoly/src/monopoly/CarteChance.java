/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author avinesse
 */
public class CarteChance {
    
    String titre;
    String description;
    int argent;
    int position;
    boolean prison;
    
    
    
    CarteChance(String t, String d, int a, int pos, boolean pri) {
        titre = t;
        description = d;
        position = pos;
        argent = a;
        prison = pri;
        
    }
    
    void effet(Joueur, PlateauJeu) {
        
        Joueur.fortune = Joueur.fortune+argent;
        Joueur.position = Joueur.position+position;
        
        if (prison) {
            Joueur.position = 10;
        }
        
    }
    
}
