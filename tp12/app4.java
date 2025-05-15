public class app4 {
public static void main(String[] args) {
        String ch = methode1.LectureC();
        if (methode1.Palindrome_rec(ch, 0, ch.length() - 1))
            System.out.println("La chaîne est un palindrome.");
        else
            System.out.println("La chaîne n'est pas un palindrome.");
    }
}