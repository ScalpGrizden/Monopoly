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
    private String nom;
    private int position;
    private int fortune;
    private LinkedList<CaseAchetable> propriete;
    private boolean enPrison;
    private int jourEnPrison;
    private Plateau plateauJeu;
   
   Joueur(){
    nom = new String();
    position=0;
    fortune=100000;
    propriete=null;
    enPrison=false;
    jourEnPrison=0;
   } 
   
   public String getNom(){
       return this.nom;
   }
   public int getPosition(){
       return this.position;
   }
   public int getFortune(){
       return this.fortune;
   }
   public LinkedList<CaseAchetable> getPropriete(){
        return this.propriete;
   }
   public boolean getEnPrison(){
       return this.enPrison;
   }
   public int getJourEnPrison(){
       return this.jourEnPrison;
   }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public void setPropriete(LinkedList<CaseAchetable> propriete) {
        this.propriete = propriete;
    }

    public void setEnPrison(boolean enPrison) {
        this.enPrison = enPrison;
    }

    public void setJourEnPrison(int jourEnPrison) {
        this.jourEnPrison = jourEnPrison;
    }
    public void ajouterJourEnPrison(){
        this.jourEnPrison=jourEnPrison+1;
    }
    public int paiement(Joueur j1,int somme){
        this.fortune-=somme;
        j1.fortune+=somme;
    }
}