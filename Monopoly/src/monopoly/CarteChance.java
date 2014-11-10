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
    
    
    
    CarteChance(String t, String d, int a, int pos, boolean prizzoooooon) {
        titre = t;
        description = d;
        position = pos;
        argent = a;
        prison = prizzoooooon;
        
    }
    
    void effet(Joueur j, Plateau p) {
        
        j.fortune = j.fortune+argent;
        j.position = j.position+position;
        
        if (prison) {
            j.position = 10;
            j.enPrison = true;
            
        }
        
    }
    
}
