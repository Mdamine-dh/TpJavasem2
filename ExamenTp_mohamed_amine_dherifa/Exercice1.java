package ExamenTp_mohamed_amine_dherifa;

import java.util.Scanner;

public class Exercice1 {

    public static double convertir(String ch){
   
        return Double.parseDouble(ch);
         
         
    }
  public static void AffichageM(String[][]M ){
   
       
 	for(int i=0;i<M.length;i++){
 		for(int j=0;j<M[i].length;j++){
 			System.out.print (M[i][j]+"|");	
 	}}}




 	
 	
  
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
  public static void AfficheMat(String[][]M,int d) {
    while (M[i][2].charAt(0)==d) {
       for(int i=0;i<M.length;i++){
        System.out.print(M[i][5]+"|");
        
    }
        
    }
}}


