package monopoly;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Utilitaire extends CaseAchetable {
    
    public Utilitaire(String nom, int position, int prix) {
        super(nom, position, prix);
    }
    
    public int nbUtilitaires(){
        
        proprietaire = getProprietaire();
        int nbUtilitaires = 0;
        
        if (proprietaire != null){
            LinkedList<CaseAchetable> proprietes = proprietaire.getPropriete();
            Iterator propriete = proprietes.iterator();
            while (propriete.hasNext())
            {
                if ("Utilitaire".equals(propriete.getClass().getName())){
                    nbUtilitaires = nbUtilitaires + 1;
                }
            }
        }
        
        return (nbUtilitaires);
    }
    
    public String toString(){
        
        Joueur proprio = getProprietaire();
        
        if (proprio == null){
            return(getNom() + " coût : " + getPrix() + " - sans propriétaire");
        }
        
        else {
            return(getNom() + " coût : " + getPrix() + " - " + proprio.getNom());
        }
    }
    
    public int calcLoyer () {
        
        Joueur proprio = getProprietaire();
        
        if (proprio == null){
            return(0);
        }
        
        else {
            Random n = new Random();
            int de = 1 + n.nextInt(5);
        
            if (nbUtilitaires() == 1) {
                return(200*de);
            }
        
            else {
                return(500*de);
            }
        }
    }
    
}
