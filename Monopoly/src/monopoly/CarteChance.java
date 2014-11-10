/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author avinesse
 */
public class CarteChance {
    
    
    String description;
    int argent;
    int position;
    boolean prison;
    
    
    
    public CarteChance( int a, int pos, boolean prizzoooooon) {
      
        description = this.createDescription(a, pos, prizzoooooon);
        position = pos;
        argent = a;
        prison = prizzoooooon;
        
    }
    
    void effet(Joueur j) {
        
        j.setFortune(j.getFortune()+argent);    
        j.setPosition((j.getPosition()+position)%40);
        
        if (prison) {
            j.setPosition(10);
            j.setEnPrison(true);
            
        }
        
    }
    
    private String createDescription(int argent, int position, boolean prison) {
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
