/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author nbrandt
 */
public class CarteCaisseCommunautaire { 
    String description;
    int argent;
    int position;
    boolean prison;
    
    
    void action(Joueur j){
        
        j.fortune = j.fortune+argent;
        j.position = j.position+position;
        
        if (prison) {
            j.position = 10;
            j.enPrison = true;}
    }
    
    public CarteCaisseCommunautaire(String d, int argent, int position, boolean prison) {
        description = d;
        this.argent=argent;
        this.position=position;
        this.prison=prison;     
    }
    
    private String createDesciption(int argent, int position, boolean prison) {
        String Str;
        if (argent>0) {
         Str="Erreur de la banque en votre faveur, recevez "+argent+" euros."; 
        }else if (argent<0) {
         Str="Amende pour excès de vitesse, payez "+argent+" euros.";
        }else if (position>0) {
         Str="Avancez de "+position+" case(s).";
        }else if (position<0) {
         Str="Reculez de "+position+" case(s).";
        }else if (prison) {
         Str="Allez en prison, ne passez pas par la case départ et ne touchez pas les 200 euros.";
        }else {
         Str="Carte spéciale!";}          
        return Str;
    }
    
}
