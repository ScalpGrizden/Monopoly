package monopoly;

import java.util.*;


public class Plateau {
    
    private ArrayList<Case> listeCases;
    private LinkedList<Joueur> listeJoueurs;
    private Boolean partieTerminee;
  
    // CONSTRUCTEURS
    public Plateau () {
        this.listeCases=new ArrayList<Case>(40);
        this.listeJoueurs= new LinkedList<Joueur>();
        partieTerminee=false;
    }
    public Plateau (ArrayList<Case> l1, LinkedList<Joueur> l2) {
        this.listeCases=l1;
        this.listeJoueurs=l2;
        partieTerminee=false;
    }

    //GETTERS & SETTERS
    public ArrayList<Case> getListeCases() {
        return listeCases;
    }
    public void setListeCases(ArrayList<Case> listeCases) {
        this.listeCases = listeCases;
    }
    public LinkedList<Joueur> getListeJoueurs() {
        return listeJoueurs;
    }
    public void setListeJoueurs(LinkedList<Joueur> listeJoueurs) {
        this.listeJoueurs = listeJoueurs;
    }  
    
    //
    public int nbGares(Joueur j) {
        int nbGares=0;
        for (Case c : listeCases) {
            if ((c.getClass().getSimpleName().equals("Gare")) && (((CaseAchetable)c).getProprietaire()==j)) {
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
        if (c.getPosition()+d<40){
        return listeCases.get(c.getPosition()+d);
        }
        else { 
        return listeCases.get(c.getPosition()+d-40);
        }
        
    }
    
    public Boolean finDePartie(){
        // la partie est terminée lorqu'il n'y a plus qu'un joueur
        if (listeJoueurs.size()==1){
            partieTerminee=true;
        }
        return (partieTerminee);
    }
    
    public void partie(){
        while(!finDePartie()){
            for(Joueur j : listeJoueurs){
                j.tourDeJeu();
                
                //si le joueur est en défaut de paiement, on le supprime de la liste de joueur
                catch (NoMoreMoney){
                    listeJoueurs.remove(j);
                    System.out.println( j.getNom() +" est un loooooooooser(une chiasse)");
                }
            }
        }
    }

}
