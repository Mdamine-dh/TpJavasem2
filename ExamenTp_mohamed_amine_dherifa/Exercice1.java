package ExamenTp_mohamed_amine_dherifa;

import java.util.Scanner;

public class Exercice1 {

    public static double convertir(String ch){
   
        return Double.parseDouble(ch);
         
         
    }
  public static void AffichageM(String[][]M ){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " | ");
            }
            System.out.println();
        }
    }



 	
 	
  
 public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : L'entier doit etre strictement positif.");
            }
        } while (n <= 0);

        return n;}
    public static void remplirMAT(String[][]M, Scanner sc ){
 	for(int i=0;i<M.length;i++){
 		for(int j=0;j<M[i].length;j++){
 			System.out.println ("m["+i+"]["+j+"]");
 			M[i][j]=sc.nextLine();
 		}
 	}
 	
 }
   public static void AfficheMat(String[][] M, char c) {
    System.out.println("Vols dont la ville de destination commence par '" + c + "':");
    boolean found = false;
    
    for (int i = 0; i < M.length; i++) {
        if (!M[i][2].isEmpty() && Character.toLowerCase(M[i][2].charAt(0)) == Character.toLowerCase(c)) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " | ");
            }
            System.out.println();
            found = true;
        }
    }

    if (!found) {
        System.out.println("Aucun vol trouvé pour cette lettre.");
    }
}
}

