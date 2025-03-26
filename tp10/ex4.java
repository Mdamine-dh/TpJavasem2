import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int nombre = methode1.lectureN(); 
        nombre = methode1.verifierNombre(nombre); 

        if (methode1.estArmstrong(nombre)) {
            System.out.println(nombre + " est un nombre d'Armstrong.");
        } else {
            System.out.println(nombre + " n'est pas un nombre d'Armstrong.");
        }
    }
}