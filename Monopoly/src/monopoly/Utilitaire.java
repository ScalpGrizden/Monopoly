package monopoly;

import java.util.Random;

public class Utilitaire extends CaseAchetable {
    
    public Utilitaire(String nom, int position, int prix) {
        super(nom, position, prix);
    }
    
    public String toString(){
        
        Joueur proprietaire = getProprietaire();
        
        if (proprietaire == null){
            return(getNom() + " coût : " + getPrix() + " - sans propriétaire");
        }
        
        else {
            return(getNom() + " coût : " + getPrix() + " - " + proprietaire.getNom());
        }
    }
    
    public int calcLoyer () {
        
        Joueur proprietaire = getProprietaire();
        
        if (proprietaire == null){
            return(0);
        }
        
        else {
            Random n = new Random();
            int de = 1 + n.nextInt(5);
            int nbUtilitaires = proprietaire.nbUtilitaires();
        
            if (nbUtilitaires == 1) {
                return(200*de);
            }
        
            else {
                return(500*de);
            }
        }
    }
    
}
