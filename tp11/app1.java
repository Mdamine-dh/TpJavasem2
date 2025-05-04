import java.util.Scanner;

public class app1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = methode1.lectureN();
        int[] T = new int[n];

       methode1.RemplirTAb(T,scanner);

        System.out.print("entrez x1: ");
        int x1 = scanner.nextInt();

        System.out.print("entrez x2: ");
        int x2 = scanner.nextInt();

        methode1.Remplacer(T, x1, x2);

        methode1.AfficheTAb(T);

        scanner.close();
    }
}
