/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rlebail
 */
public class Rue extends CaseAchetable {
    
    int nMaison;
    int prixMaison;
    boolean hotel;
    
    Rue(String nom, int position, boolean isHypotheque,Joueur proprietaire, int nM, int prixM, boolean hotel){
        super(nom, position, isHypotheque, proprietaire);
        nMaison=nM;
        prixMaison=prixM;
        this.hotel=hotel;
    }
    
    public void action(Joueur j){
       if(proprietaire == null ){//si la case n'appartient pas à un joueur
           if(j.getFortune()-prix>0){//si le joueur a les moyens
                acheter(j);
           }
       }
       else{
           if(isHypotheque == false ){
           calcLoyer();//le joueur va devoir payer
           }
       }
    }
    
        
    public void construire(){
        if(hotel==true){
            System.out.println("un hotel est déjà construit, vous ne pouvez plus construire sur cette case");
        }
            else{
            proprietaire.setFortune(proprietaire.getFortune()-10000);
            }//le joueur paye la maison
            if (nMaison==4){//la case va avoir un hotel
                nMaison=0;
                hotel=true;
            }
            else{//la case va avoir une maison de plus
                nMaison=nMaison+1;
            }
            }
    
    
    
    public int calcLoyer(){
        float c=position/10;
        int a=(int) c; //coefficient du cout en fonction de la position    
        int b=1000;//coefficient du cout en fonction des maisons et hotel
 
        int cout;
        
        if(hotel==true){
            cout=6*b*a+a*1000;
        }
        else{
            cout=(nMaison)*b*a+a*1000;
        }
        
        return cout;
    }
    
}