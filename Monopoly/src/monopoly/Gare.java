/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rlebail
 */
public class Gare extends CaseAchetable {
    
    private final int COEFGARE = 492;
    
    public Gare(String nom, int position, int prix) {
        super(nom, position, prix);
    }
    
    public int calcLoyer() {
        return (this.getProprietaire().getPlateau().nbGares(this.getProprietaire()) * COEFGARE);
    }
}
