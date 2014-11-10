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

    public IncomeTax() {
        super("Impôt sur le revenu", 4);
    }
    /*
     * Modifie la fortune du joueur : -10% de sa fortune, plafonné à 200$
     */
    public void action(Joueur player) {
        int montant_paye;
        try{
        if (player.getFortune() * 0.1 < 200) {
            montant_paye = (int) (player.getFortune() * 0.1);
            player.payer(montant_paye); 
        } else {
            montant_paye =200;
            player.payer(200);
            
        }
        System.out.println(player+" paye l'impôt sur le revenu, et perd "+montant_paye+"$");
        }
        catch(NoMoreMoneyException e){
            
        }
        
    }

    public String toString() {
        String res = "Impôt sur le revenu";
        return res;
    }
}