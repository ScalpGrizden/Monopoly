package monopoly;

import java.util.Random;

public class Utilitaire extends CaseAchetable {
    
    public Utilitaire () {
        super();
    }
    
    public Utilitaire(String nom, int position, int prix) {
        super(nom, position, prix);
    }
    
    public String toString(){
        
        if (proprietaire == NULL){
            return(+ nom + " coût : " + prix + " - sans propriétaire");
        }
        
        else {
            return(+ nom + " coût : " + prix + " - " + proprietaire.getNom());
        }
    }
    
    public int loyer () {
        
        if (proprietaire == NULL){
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
