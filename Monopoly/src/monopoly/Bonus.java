/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rmeyer
 */
public abstract class Bonus extends Case{
    private int position;
    private String nom;
    /*
     * @param nom le nom de la case Bonus
     * @param position la position de la case Bonus
     */
    public Bonus(String nom,int position){
        super(nom,position);
    }
    
    //Action à déclencher lorsque le joueur passe sur la case Bonus
    /*
     * @param player le joueur qui est tombé sur la case bonus
     */
    public abstract void action(Joueur player );

}
