/*
 * Classe définissant la case départ du jeu
 */
package monopoly;

/**
 *
 * @author Акатош
 */
public class Depart extends Case{
    
    /**
     * Constructeur vide
     */
    public Depart(){
        super();
    }
    /**
     * Lance l'action de la case (donner 20.000 F)
     * @param joueur 
     */
    public void action(Joueur joueur){
        //Donne 20.000F au joueur
        //Il aura également 20.000F en passant par cette case (géré dans plateau)
        //S'il s'arrête pile sur cette case il recevra bien le double de 20.000F
        
    }
}
