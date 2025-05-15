public class app3 {

      public static void main(String[] args) {
        int n = methode1.lectureN();
        System.out.println("Nombres premiers inférieurs à " + n + " : ");
        for (int i = 2; i < n; i++) {
            if (methode1.EstPremier_rec(n, i)){
                System.out.print(i + " ");
        }
    }
      }}