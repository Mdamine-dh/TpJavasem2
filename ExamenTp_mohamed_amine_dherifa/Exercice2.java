package ExamenTp_mohamed_amine_dherifa;
import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=Exercice1.lectureN();
         int n2=Exercice1.lectureN();
         String[][] VOL=new String[n1][n2];
         Exercice1.remplirMAT(VOL, sc);
         System.out.println("entrez la premiere lettre de la ville de destination");
         char c=sc.next().charAt(0);
         sc.nextLine();
         Exercice1.AfficheMat(VOL,c);
        for(int i=1;i<VOL.length;i++){
         double s=Exercice1.convertir(VOL[i][5])*0.8;
          VOL[i][5]=String.valueOf(s);
         }
       System.out.println("tableau apres remise:");
       Exercice1.AffichageM(VOL);
}

        
    }
    

