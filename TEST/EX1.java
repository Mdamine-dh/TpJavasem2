import java.util.Scanner;

public class EX1{
    
    // Méthode pour lire un entier strictement positif
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
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n <= 0);

        return n;
       
    }
     public static int Compter(int n) {
        return String.valueOf(n).length();
    }
    
   
    public static void main(String[] args) {
        int nombre =lectureN();
        System.out.println("Le nombre de chiffres de " + nombre + " est : " +Compter(nombre));
    }
}