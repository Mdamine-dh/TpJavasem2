import java.util.Scanner;
public class ex5{
	public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre réel x : ");
        float x = scanner.nextFloat();
        
        System.out.print("Entrez l'exposant n : ");
         int n = methode1.lectureN();
        
        float result = methode1.power(x, n);
        System.out.println("Résultat : " + result);

        scanner.close(); 
    
}				
}