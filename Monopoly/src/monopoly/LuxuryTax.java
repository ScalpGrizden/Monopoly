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

    public LuxuryTax() {
        super("Taxe de luxe",38);
    }
    /*
     * Retire 75$ de la fortune du joueur
     */
    public void action(Joueur player)
    {
        try{
        player.payer(75);
        System.out.println(player+" paye la taxe de luxe, et perd 75$");
        }
        catch(NoMoreMoneyException e){
            
        }
    }
    public String toString(){
        String res="Taxe de luxe";
        return res;
    }
}
