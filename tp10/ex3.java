import java.util.Scanner;

public class ex3 {

    // Méthode principale
    public static void main(String[] args) {
        int nombre = methode1.lectureN();
        System.out.println("La somme des " + nombre + " premiers carrés est : " + methode1.calculeSomme(nombre));
    }
}