/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.LinkedList;

/**
 *
 * @author bchevill
 */
public class Joueur {
    String nom;
    int position;
    int fortune;
    LinkedList<CaseAchetable> propriete;
    boolean enPrison;
    int jourEnPrison;
   
   Joueur(){
    nom = new String();
    position=0;
    fortune=100000;
    propriete=null;
    enPrison=false;
    jourEnPrison=0;
   } 
   
   public String GetNom(){
       return this.nom;
   }
   public int GetPosition(){
       
   
   }
   
}