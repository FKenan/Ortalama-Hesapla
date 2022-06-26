import java.util.Arrays;
import java.util.Scanner;
public class KütleIndex {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double index,boy,kilo;

        System.out.print("Boyunu Gir");
        boy = inp.nextDouble();
        System.out.print("Kilonu Gir");
        kilo = inp.nextDouble();

        index = boy*boy / kilo;
        System.out.print("Kitle indexiniz : " +index);
    }
}
