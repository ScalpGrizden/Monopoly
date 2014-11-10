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
    
public CarteChanceAnniversaire(int a, int pos, boolean prizzoooooon) {
        super(a, pos, prizzoooooon);
        description = createDescription(a, pos, prizzoooooon);
  
    }
    
public void effect (Joueur j) {
    for (Joueur joueur : j.getPlateau().getListeJoueurs()) 
    {
        joueur.setFortune(joueur.getFortune() - argent);
        j.setFortune(j.getFortune() + argent);
    }
}

 private String createDescription(int argent, int position, boolean prison) {
        String Str;
        Str="C'est votre anniversaire ! Chaque joueur doit vous donner "+argent+" euros !";   
        return Str;
    
    }
 
}
