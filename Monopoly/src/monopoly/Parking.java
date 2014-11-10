/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rmeyer
 */
public class Parking extends Bonus {

    private String nom;
    private int position;
    private int montant;

    public Parking(String nom, int position) {
        super(nom, position);
        montant = 0;
    }
    /*
     * @return le nom de la case
     */

    public String getNom() {
        return this.nom;
    }
    /*
     * @return la position de la case
     */

    public int getPosition() {
        return this.position;
    }
    /*
     * @return le montant de la case
     */

    public int getMontant() {
        return this.montant;
    }
    /*
     * @param le montant à ajouter à la case parking
     */

    public void ajouterMontant(int montant) {
        this.montant += montant;
    }
    /*
     * Augmente la fortune du joueur du montant du parking, et remet le montant à 0
     */

    public void action(Joueur player) {
        player.setFortune(player.getFortune() + montant);
        montant = 0;
    }

    public String toString() {
        String res = "Vous ramassez l'argent déposé au parking (" + montant + "), le montant du parking est remis à 0";
        return res;
    }
}
