import java.util.Scanner;

public class methode1 {
    
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
   

    // Méthode pour compter le nombre de chiffres d'un entier
    public static int Compter(int n) {
        return String.valueOf(n).length();
    }

      // Méthode pour vérifier si un nombre est pair
    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
    
    // Méthode pour calculer la somme des n premiers carrés
    public static int calculeSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i *i;
        }
        return somme;
  
    }
   
 // Méthode pour s'assurer que le nombre est inférieur à 1000
    public static int verifierNombre(int n) {
        while (n >= 1000) {
            System.out.println("Entrez un nombre inférieur à 1000");
            n = lectureN(); 
        }
        return n; 
    }

    // Méthode pour vérifier si un nombre est un nombre d'Armstrong
    public static boolean estArmstrong(int n) {
        int original = n;
        int somme = 0;
        int longueur = String.valueOf(n).length();

        while (n > 0) {
            int chiffre = n % 10;
            somme += Math.pow(chiffre, longueur);
            n /= 10;
        }

        return somme == original;
    }   
    	
    	

    
    public static float power(float x, int n) {
        return (float) Math.pow(x, n); // Conversion explicite en float
    }

   
    	
}
