/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author avinesse
 */
public class Chance extends Pioche {
    
    ArrayList<CarteChance> listeCartesChance;
    
    public Chance(String nom, int position) {
       super(nom, position);
       listeCartesChance= new ArrayList<CarteChance>();
      CarteChance c1= new CarteChance(0,1,false);
       listeCartesChance.add(c1);
       CarteChance c2= new CarteChance(0,2,false);
       listeCartesChance.add(c2);
       CarteChance c3= new CarteChance(0,-3,false);
       listeCartesChance.add(c3);
       CarteChance c4= new CarteChance(0,-1,false);
       listeCartesChance.add(c4);
       CarteChance c5= new CarteChance(2000,0,false);
       listeCartesChance.add(c5);
       CarteChance c6= new CarteChance(2000,0,false);
       listeCartesChance.add(c6);
       CarteChance c7= new CarteChance(3000,0,false);
       listeCartesChance.add(c7);
       CarteChance c8= new CarteChance(1000,0,false);
       listeCartesChance.add(c8);
       CarteChance c9= new CarteChance(-1500,0,false);
       listeCartesChance.add(c9);
       CarteChance c10= new CarteChance(-20,0,false);
       listeCartesChance.add(c10);
       CarteChance c11= new CarteChance(-2000,0,false);
       listeCartesChance.add(c11);
       CarteChance c12= new CarteChance(-2500,0,false);
       listeCartesChance.add(c12);
       CarteChance c13= new CarteChance(-1000,0,false);
       listeCartesChance.add(c13);
       CarteChance c14= new CarteChance(3500,0,false);
       listeCartesChance.add(c14);
       CarteChanceAnniversaire c15 = new CarteChanceAnniversaire (1000,0,false);
       listeCartesChance.add(c15);
       CarteChanceAnniversaire c16 = new CarteChanceAnniversaire (1500,0,false);
       listeCartesChance.add(c16);
    }
   
    public void action(Joueur j){
      Random position = new Random();
      CarteChance carte= listeCartesChance.get(position.nextInt(listeCartesChance.size()));
      carte.effet(j);
  }
    
}
