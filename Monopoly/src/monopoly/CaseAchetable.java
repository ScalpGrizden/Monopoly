package monopoly;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class CaseAchetable extends Case {
    
    protected Joueur proprietaire;
    protected int prix;
    boolean isHypotheque;
    
    
    
    public CaseAchetable(String nom, int position, int prx) {
        super(nom, position);
        prix = prx;
        proprietaire = null;
        isHypotheque = false;
    }
    
    public Joueur getProprietaire() {
        return proprietaire;
    }
    
    public void setProprietaire(Joueur prop) {
        proprietaire = prop;
    }
    
    public int getPrix () {
        return prix;
    }
    
    public void setPrix (int n){
        prix = n;
    }
    
    public Boolean isHypotheque() {
        return isHypotheque;
    }
    
    public void acheter(Joueur player) {
        proprietaire = player;
        player.setFortune(player.getFortune()-prix);//le joueur doit payer pour acheter la propriete
        
    }
    
    public void hypotheque() {
        if (isHypotheque) {
            proprietaire.setFortune(proprietaire.getFortune()-prix/2);
            isHypotheque = false;
        }
        else {
            proprietaire.setFortune(proprietaire.getFortune()+prix/2);
            isHypotheque = true;
        }
    }
    
    
    
    @Override
    public void action(Joueur player) throws NoMoreMoneyException {
        if (proprietaire == null){
            // proposer d'acheter?
        }
        else {
            if (proprietaire == player){
                // proposer d'acheter des maisons
            }
            else {
               
                    player.payer(calcLoyer(),proprietaire);
                
                  }
        }
    }
    
    public abstract int calcLoyer();
    
}
