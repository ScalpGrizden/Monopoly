/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rlebail
 */
public abstract class Case {
    private String nom;
    private int position;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPosition() {
        return position;
    }
    private void setPosition(int position) {
        this.position = position;
    }
    
    abstract public void action(Joueur j);
}
