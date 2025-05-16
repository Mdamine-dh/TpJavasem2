import java.util.Scanner;
public class app5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        String ch=methode1.LectureC();
        System.out.println("donne un caracter");
        char a=sc.next().charAt(0);
        int s=methode1.Nbr_Occ_rec(ch, a, i);
        System.out.println("le caracter "+a+" repete "+s+" fois dans le mot");

    }}
