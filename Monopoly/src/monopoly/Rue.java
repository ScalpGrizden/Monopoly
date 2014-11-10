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
    
    Rue(String nom, int position, int prix, int prixM){
        super(nom, position, prix);
        nMaison=0;
        prixMaison=prixM;
        hotel=false;
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
        float c=getPosition()/10;
        int a=(int) c+1; //coefficient du cout en fonction de la position    
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
    
    
    public String toString(){
        if(proprietaire==null){
            return getNom()+" (coût : "+prix+" )  - sans propriétaire";
        }
        else{
            return getNom()+" (coût : "+prix+" )  - propriétaire : " + proprietaire.getNom()+
                    ", "+nMaison+" maisons"+", loyer = "+calcLoyer();
        }
    }
}