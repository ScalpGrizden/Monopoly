/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rmeyer
 */
public class IncomeTax extends Bonus {

    private String nom;
    private int position;

    public IncomeTax(String nom, int position) {
        super(nom, position);
    }
    /*
     * Modifie la fortune du joueur : -10% de sa fortune, plafonné à 200$
     */
    public void action(Joueur player) {
        if (player.getFortune() * 0.1 < 200) {
            player.setFortune(player.getFortune() - 200);
            
        } else {
            player.setFortune((int) (player.getFortune() * 0.9));
        }

    }

    public String toString() {
        String res = "Vous payez l'impôt sur le revenu (200$ ou 10% de votre fortune)";
        return res;
    }
}