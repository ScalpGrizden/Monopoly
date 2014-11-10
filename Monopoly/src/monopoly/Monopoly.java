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
        Parking Parking = new Parking(); //position 20
        IncomeTax IncomeTax = new IncomeTax (); //position 4
        LuxuryTax LuxuryTax = new LuxuryTax (); //position 38
        Depart Depart=new Depart(); // position 0
        Plateau p = new Plateau();
        //La suite est triviale.
        while (p.getListeJoueurs().size()>1){
            p.tourDeJeu();
        }
        System.out.println("La partie est terminée, le joueur "
                +p.getListeJoueurs().getFirst().getNom()+" a gagné la partie");
                
    }
}
