import java.util.Scanner;

public class EX2 {
    
   
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

   
    public static float Calculater(int num1, int num2) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez une opération ");
        char operation = scanner.next().charAt(0);
        float resultat;

        switch (operation) {
            case '+':
                resultat = num1 + num2;
                break;
            case '-':
                resultat = num1 - num2;
                break;
            case '*':
                resultat = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultat =  num1 / num2;
                } else {
                    System.out.println("Erreur : division par zéro !");
                    resultat = 0;
                }
                break;
            default:
                System.out.println("Opération invalide !");
                resultat = 0;
        }

        return resultat;
    }

    public static void main(String[] args) {
        int nb1 = lectureN();
        int nb2 = lectureN();
        float resultat = Calculater(nb1, nb2);
        System.out.println("Résultat = " + resultat);
    }
}
