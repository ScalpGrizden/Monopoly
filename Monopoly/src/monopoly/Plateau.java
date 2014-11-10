package monopoly;

import java.util.*;


public class Plateau {
    
    private ArrayList<Case> listeCases;
    private ArrayList<Joueur> listeJoueurs;
    
    
  
    public Plateau (ArrayList<Case> l1, ArrayList<Joueur> l2) {
        this.listeCases=l1;
        this.listeJoueurs=l2;
    }
    
    public Plateau () {
        this.listeCases=new ArrayList<Case>();
        this.listeJoueurs= new ArrayList<Joueur>();
    }
    
    public int nbGares(Joueur j) {
        int nbgares=0;
        for (Case c : listeCases) {
            if ((c instanceof Gare) &&(c.getProprietaire()==j)) {
                nbgares++;
            }
        }
        return nbgares;
    }
    
    public void affiche() {
        for (Case c : listeCases) {
            System.out.println(c.toString()+"\n");
        }
    }
    
    public Case avance(Case c, int d) {
        return listeCases[c.getPosition()+d];
    }
}
