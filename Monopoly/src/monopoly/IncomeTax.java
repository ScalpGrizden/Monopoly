/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rmeyer
 */
public class IncomeTax extends Bonus{
    private String nom;
    private int position;

    public IncomeTax(String nom, int position) {
        super(nom,position);
    }
    public void action(Joueur player)
    {
        //Ajouter code pour retirer 200$ ou 10% du budget du joueur, selon lequel est le 
        //plus haut
    }
    public String toString(){
        String res="Vous payez l'impôt sur le revenu (200$ ou 10% de votre fortune)";
        return res;
    }
 
}