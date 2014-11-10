/*
 * Classe définissant la case départ du jeu
 */
package monopoly;

/**
 *
 * @author Акатош
 */
public class Depart extends Bonus{
    
    /**
     * Constructeur vide
     */
    public Depart(){
        super("Depart",0);
    }
    /**
     * Lance l'action de la case (donner 200€ au joueur)
     * @param joueur 
     */
    public void action(Joueur joueur){
        //Donne 200€ au joueur
        //Il aura également 200€ en passant par cette case (géré dans plateau)
        //S'il s'arrête pile sur cette case il recevra bien le double de 200€ (400€)
        joueur.setFortune(joueur.getFortune()+200);
    }
}
