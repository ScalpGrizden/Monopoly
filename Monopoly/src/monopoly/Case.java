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
    protected int position;

public Case(String nom, int pos) {
        this.nom = nom;
        position = pos;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    
    abstract public void action(Joueur j) throws NoMoreMoneyException;
}
