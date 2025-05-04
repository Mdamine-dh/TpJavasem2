import java.util.Scanner;
public class Ap2{
	public static void main (String[] args) {
	 Scanner scanner= new Scanner (System.in);
	 int n=methode1.lectureN();
	 double[] T=new double [n];
	 methode1.RemplirTAb(T,scanner);
	 double S=methode1.Calcul_Moy(T);
	 System.out.println ("le moyenne de classe :  "+S);
	 int nbr=methode1.NombreNote(T,S);
	 System.out.println ("le nombre de notes superieures a la moyenne de la classe :  "  + nbr);
	 scanner.close();
}}