package monopoly;

import java.util.*;


public class Plateau {
    
    private ArrayList<Case> listeCases;
    private LinkedList<Joueur> listeJoueurs;
    private Boolean partieTerminee;
    
    
  
    public Plateau (ArrayList<Case> l1, LinkedList<Joueur> l2) {
        this.listeCases=l1;
        this.listeJoueurs=l2;
        partieTerminee=false;
    }
    
    public Plateau () {
        this.listeCases=new ArrayList<Case>(40);
        this.listeJoueurs= new LinkedList<Joueur>();
    }
    
    public int nbGares(Joueur j) {
        int nbGares=0;
        for (Case c : listeCases) {
            if ((c instanceof Gare) &&(c.getProprietaire()==j)) {
                nbGares++;
            }
        }
        return nbGares;
    }
    
    public void affiche() {
        for (Case c : listeCases) {
            System.out.println(c.toString()+"\n");
        }
        
        //TODO afficher les joueurs
        for (Joueur j : listeJoueurs) {
            System.out.println(j.toString()+"\n");
        }
    }
    
    public Case avance(Case c, int d) {
        return listeCases.get(c.getPosition()+d);
    }
    
    public Boolean finDePartie(){
        partieTerminee=true;
        return (partieTerminee);
    }
}
