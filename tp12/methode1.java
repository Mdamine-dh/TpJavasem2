import java.util.Scanner;

public class methode1 {
    
    // Methode pour lire un entier strictement positif
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

        return n;
       
    }
   

    // Methode pour compter le nombre de chiffres d'un entier
    public static int Compter(int n) {
        return String.valueOf(n).length();
    }

      // Methode pour verifier si un nombre est pair
    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
    
    // Methode pour calculer la somme des n premiers carres
    public static int calculeSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i *i;
        }
        return somme;
  
    }
   
 // Methode pour s'assurer que le nombre est inferieur a 1000
    public static int verifierNombre(int n) {
        while (n >= 1000) {
            System.out.println("Entrez un nombre inferieur a 1000");
            n = lectureN(); 
        }
        return n; 
    }

    // Methode pour verifier si un nombre est un nombre d'Armstrong
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

   
    //remplir tableau par entier	

public static void RemplirTAb(int[] tab, Scanner scanner) {
        System.out.println("Entrez les elements du tableau :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("element " + (i + 1) + ": ");
            tab[i] = scanner.nextInt();
        }
    }
    //remplace x1 par x2
   public static void Remplacer(int[] tab, int x1, int x2) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
    }
    //affiche le tableau
 public static void AfficheTAb(int[] tab) {
        for (int val : tab) {
            System.out.print(val + " ");
        }       
    }
    // remplir tableau par reel
    public static void RemplirTAb(double[] notes, Scanner scanner) {
        for (int i = 0; i < notes.length; i++) {
            double note;
            do {
                System.out.print("entrez le note d etudiant " + (i + 1) + " : ");
                note = scanner.nextDouble();
            } while (note < 0 || note > 20);
            notes[i] = note;
        }
    }
    // calcul myenne generale de class
     public static double Calcul_Moy(double[] notes) {
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }
    // calcule les nobres de notes superieures a la moyenne de la classe
     public static int NombreNote(double[] notes, double moyenne) {
        int count = 0;
        for (double note : notes) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }
    //Tableau des entiers pairs
    public static int[] creeTpair(int[] Tab){
    int	count=0;
    for (int i = 0; i < Tab.length; i++) {
    if (Tab[i] % 2 == 0) {
       count++;}
    }
    	int j=0;
    	int[] pairs=new int[count];
    
    for (int i = 0; i < Tab.length; i++) {
    if (Tab[i] % 2 == 0) {
        pairs[j] = Tab[i];
        j++;}}
    return pairs;
   
    }
    //Tableau des entiers impairs
    public static int[] creeTimpair(int[] Tab) {
    int count = 0;


    for (int i = 0; i < Tab.length; i++) {
        if (Tab[i] % 2 != 0) {
            count++;
        }
    }

    int[] impairs = new int[count];
    int j = 0;

    
    for (int i = 0; i < Tab.length; i++) {
        if (Tab[i] % 2 != 0) {
            impairs[j] = Tab[i];
            j++;
        }
    }

    return impairs;
}
 //remplire matrice des reel
 public static void remplirMAT(double[][]M, Scanner sc ){
 	for(int i=0;i<M.length;i++){
 		for(int j=0;j<M[i].length;j++){
 			System.out.println ("m["+i+"]["+j+"]");
 			M[i][j]=sc.nextDouble();
 		}
 	}
 	
 }
 // calcule somme ligne
 public static double calculeSommeLigne(double[][]M,int i ){
 	double somme=0;
 	for(int j=0;j<M[i].length;j++){
 		somme+=M[i][j];}
 	return somme;	
 }


  public static int Somme_rec(int n) {
        if (n == 1)
            return 1;
        return n + Somme_rec(n - 1);
    }
   public static int Factoriel_rec(int n) {
        if (n == 1)
            return 1;
        return n * Factoriel_rec(n - 1);
    }
       static boolean EstPremier_rec(int n, int div) {
        if (n < 2) return false;
        if (div == 1) return true;
        if (n % div == 0) return false;
        return EstPremier_rec(n, div - 1);
    }
        static boolean Palindrome_rec(String ch, int start, int end) {
        if (start >= end)
            return true;
        if (ch.charAt(start) != ch.charAt(end))
            return false;
        return Palindrome_rec(ch, start + 1, end - 1);
    }
    public static String LectureC() {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Entrez une chaîne (max 30 caractères) : ");
            ch = sc.nextLine();
        } while (ch.length() > 30);
        return ch;
    }


}


