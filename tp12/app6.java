import java.util.Scanner;
public class app6 {
    public static void main(String[] args) {
        int i=0;
        Scanner scanner= new Scanner(System.in);
        int n=methode1.lectureN();
        int[] tab= new int[n];
        methode1.RemplirTAb(tab, scanner);
        int somme=methode1.sommeTab_rec(tab, i);
        System.out.println("la somme = "+somme);
        scanner.close();


    }
    
}
