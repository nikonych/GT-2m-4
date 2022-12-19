import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(sc.next());
        }

        System.out.println(A);

        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            B.add(sc.next());
        }

        System.out.println(B);

        ArrayList<String> C = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(B.size()-i-1));
        }

        System.out.println(C);

        Collections.sort(C, (a, b)->Integer.compare(a.length(), b.length()));

        System.out.println(C);

    }
}