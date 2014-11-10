/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rlebail
 */
public class Monopoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Plateau p = new Plateau();
        //La suite est triviale.
        p.partie();
        System.out.println("La partie est terminée, le joueur "
                +p.getListeJoueurs().getFirst().getNom()+" a gagné la partie");
                
    }
}
