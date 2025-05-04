import java.util.Scanner;
public class APP3 {
	public static void main (String[] args){
		Scanner scanner=new Scanner(System.in);
	int n=methode1.lectureN();
	int[] T=new int[n];
	methode1.RemplirTAb(T,scanner);
	int[] pairs=methode1.creeTpair(T);
	int[] impairs=methode1.creeTimpair(T);
	System.out.print ("les nombres pairs sont :");
methode1.AfficheTAb(pairs);
System.out.print ("\nles nombres impairs sont :");
methode1.AfficheTAb(impairs);
scanner.close();

	scanner.close();
    }
}