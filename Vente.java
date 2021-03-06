import java.util.Scanner;
public class Vente{
    public static void main(String[] agrs){
        try{
            // declaration de la constants TVA, 
            //le F de 0.18 permet de convertir en float car 0.18 est un double
            final float TAUX_TVA = 0.18F;
            int horsTaxe, remise = 0, TTC;
            // objet pour saisir au clavier
            Scanner sc = new Scanner(System.in);
            System.out.print("Saisir le montant hors taxe : ");
            // nextInt() fonction pour saisir un entier au clavier
            horsTaxe = sc.nextInt();
            // calcul du montant TTC
            TTC = (int)(horsTaxe * (1 + TAUX_TVA));
            // les remises, on est obligé de caster les float en int 
            // sinon on aura une exception
            if(TTC >= 1000 && TTC <= 2000){
                remise = (int)(TTC * 0.02f);
            }
            else{
                if(TTC > 2000 && TTC <= 10000){
                    remise = (int)(TTC * 0.05f);
                }
                else if(TTC > 10000){
                    remise = (int)(TTC * 0.07f);
                }
            }
            System.out.println("Hors taxe : "+horsTaxe);
            System.out.println("TTC : "+TTC);
            System.out.println("Remise : "+remise);
        }
        catch(Exception e){
            System.out.println("Erreur : "+e.getMessage());
        }
    }
}