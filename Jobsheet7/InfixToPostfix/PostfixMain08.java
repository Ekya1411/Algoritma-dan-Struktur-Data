package InfixToPostfix;
import java.util.Scanner;

public class PostfixMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.print("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix08 postfix = new Postfix08(total);
        P = postfix.konversi(Q);
        System.out.println("Postfix : " + P);

    }
}