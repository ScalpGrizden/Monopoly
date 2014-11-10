/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rmeyer
 */
public class LuxuryTax extends Bonus{
    private String nom;
    private int position;

    public LuxuryTax(String nom, int position) {
        super(nom,position);
    }
    public void action(Joueur player)
    {
        //Ajouter méthode permettant de retirer 75 $ de l'argent du joueur 
    }
    public String toString(){
        String res="Vous payez la taxe de luxe(75$)";
        return res;
    }
}
