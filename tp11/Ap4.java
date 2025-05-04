import java.util.Scanner;
public class Ap4 {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
	int n1=methode1.lectureN();
	int n2=methode1.lectureN();
	double[][]M=new double [n1][n2];
	methode1.remplirMAT(M,sc);
	System.out.print("sommes des lignes :");
	for(int i=0;i<n1;i++){
		System.out.print ("\nsomme de linge "+i+"="+  methode1.calculeSommeLigne(M,i));
	}
	 sc.close();
	
    }
}