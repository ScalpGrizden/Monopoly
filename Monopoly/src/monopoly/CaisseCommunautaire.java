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
    
    public CaisseCommunautaire(String nom, int position){
        super(nom,position);
       listeCartesCaisseCommunautaire= new ArrayList<CarteCaisseCommunautaire>();
       for (int i=0;i<2;i++){
           /* 2 cartes prison, 8 argent, 6 position) */
           CarteCaisseCommunautaire c= new CarteCaisseCommunautaire(0,0,true);
           listeCartesCaisseCommunautaire.add(c);
       }
       //creation des cartes
       CarteCaisseCommunautaire c1= new CarteCaisseCommunautaire(0,1,false);
       listeCartesCaisseCommunautaire.add(c1);
       CarteCaisseCommunautaire c2= new CarteCaisseCommunautaire(0,2,false);
       listeCartesCaisseCommunautaire.add(c2);
       CarteCaisseCommunautaire c3= new CarteCaisseCommunautaire(0,-1,false);
       listeCartesCaisseCommunautaire.add(c3);
       CarteCaisseCommunautaire c4= new CarteCaisseCommunautaire(0,-2,false);
       listeCartesCaisseCommunautaire.add(c4);
       CarteCaisseCommunautaire c5= new CarteCaisseCommunautaire(20,0,false);
       listeCartesCaisseCommunautaire.add(c5);
       CarteCaisseCommunautaire c6= new CarteCaisseCommunautaire(20,0,false);
       listeCartesCaisseCommunautaire.add(c6);
       CarteCaisseCommunautaire c7= new CarteCaisseCommunautaire(20,0,false);
       listeCartesCaisseCommunautaire.add(c7);
       CarteCaisseCommunautaire c8= new CarteCaisseCommunautaire(100,0,false);
       listeCartesCaisseCommunautaire.add(c8);
       CarteCaisseCommunautaire c9= new CarteCaisseCommunautaire(-100,0,false);
       listeCartesCaisseCommunautaire.add(c9);
       CarteCaisseCommunautaire c10= new CarteCaisseCommunautaire(-20,0,false);
       listeCartesCaisseCommunautaire.add(c10);
       CarteCaisseCommunautaire c11= new CarteCaisseCommunautaire(-20,0,false);
       listeCartesCaisseCommunautaire.add(c11);
       CarteCaisseCommunautaire c12= new CarteCaisseCommunautaire(-10,0,false);
       listeCartesCaisseCommunautaire.add(c12);
       CarteCaisseCommunautaire c13= new CarteCaisseCommunautaire(-10,0,false);
       listeCartesCaisseCommunautaire.add(c13);
       CarteCaisseCommunautaire c14= new CarteCaisseCommunautaire(50,0,false);
       listeCartesCaisseCommunautaire.add(c14);
       
       
    }
    
    @Override
  public void action(Joueur j){
      Random position = new Random();
      CarteCaisseCommunautaire carte= listeCartesCaisseCommunautaire.get(position.nextInt(listeCartesCaisseCommunautaire.size()));
      carte.effet(j);
  }
    
}
