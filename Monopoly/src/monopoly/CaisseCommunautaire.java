/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Johan
 */
public class CaisseCommunautaire extends Pioche{
    ArrayList<CarteCaisseCommunautaire> listeCartesCaisseCommunautaire;
    
    public CaisseCommunautaire(){
       listeCartesCaisseCommunautaire= new ArrayList<CarteCaisseCommunautaire>();
       for (int i=0;i<16;i++){
           CarteCaisseCommunautaire c= new CarteCaisseCommunautaire(d,argent,position,prison);
       }
    }
    
  public void action(Joueur j){
      Random position = new Random();
      CarteCaisseCommunautaire carte= listeCartesCaisseCommunautaire.get(position.nextInt(listeCartesCaisseCommunautaire.size()));
      carte.effet(j);
  }
    
}
