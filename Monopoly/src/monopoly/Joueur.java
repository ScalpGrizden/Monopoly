package monopoly;

import java.util.LinkedList;

/**
 *
 * @author bchevill
 */
public class Joueur {
    private String nom;
    private Case caseActuelle;
    private int fortune;
    private LinkedList<CaseAchetable> propriete;
    private boolean enPrison;
    private int jourEnPrison;
    private Plateau plateauJeu;
    private int nbUtilitaires;
   
   Joueur(){
    nom = new String();
    fortune=100000;
    propriete=null;
    enPrison=false;
    jourEnPrison=0;
    plateauJeu=new Plateau();
    caseActuelle=new Depart();
   } 
   
   public String getNom(){
       return this.nom;
   }
   public int getPosition(){
       return this.caseActuelle.getPosition();
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
   public Plateau getPlateau(){
       return this.plateauJeu;
   }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPosition(int p) {
        this.caseActuelle = this.plateauJeu.getListeCases().get(p);
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
    public void setPlateau(Plateau p){
        this.plateauJeu=p;
    }
    public void ajouterJourEnPrison(){
        this.jourEnPrison=jourEnPrison+1;
    }
    public void gagnerArgent(int somme){
        this.fortune+=somme;
    }
    public void payer(int somme, Joueur j) throws NoMoreMoneyException{
        if(this.fortune > somme){
            this.fortune-=somme;
            j.setFortune(j.getFortune()+somme);
        }else{
            this.fortune = 0;
            throw(new NoMoreMoneyException());
        }
    }
    public void payer(int somme) throws NoMoreMoneyException{
        if(this.fortune > somme){
            this.fortune-=somme; 
        }else{
            this.fortune = 0;
            throw(new NoMoreMoneyException());
        }
    }

    public void payerJoueur(Joueur j, int somme)throws NoMoreMoneyException{
        this.payer(somme);
        j.gagnerArgent(somme);
    }

    public void acheter(CaseAchetable c)throws NoMoreMoneyException{
        this.propriete.add(c);
        payer(c.getPrix());
        c.setProprietaire(this); 
    }
    public static int lanceLeDe(){
        return ((int)Math.floor(Math.random()*6))+1;
    }
    public void tourDeJeu()throws NoMoreMoneyException{
        if (this.enPrison){
            this.caseActuelle.action(this);
        }
        else {
            this.caseActuelle = this.plateauJeu.avance(caseActuelle, lanceLeDe());
            System.out.println("Le Joueur " + this.nom + " est en ");
            if(caseActuelle instanceof CaseAchetable){
                if(((CaseAchetable) caseActuelle).getProprietaire() == null){
                    this.acheter((CaseAchetable)caseActuelle);
                }
                else{
                    this.payerJoueur(((CaseAchetable)caseActuelle).getProprietaire(), ((CaseAchetable)caseActuelle).calcLoyer());
                }
            }
            else if(caseActuelle instanceof Bonus){
                this.caseActuelle.action(this);
            }
        } 
    }
}
