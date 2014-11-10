package monopoly;

import java.util.Random;

public class Utilitaire extends CaseAchetable {
    
    public Utilitaire () {
        super();
    }
    
    public int loyer () {
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
