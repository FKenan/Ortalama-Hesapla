import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double kdvsiz,kdvli,kdvTutarı;

        System.out.println("Tutar Giriniz");

        kdvsiz = inp.nextFloat();

        kdvTutarı = kdvsiz < 1000 ? kdvsiz * 0.18 : kdvsiz * 0.08;
        kdvli = kdvsiz + kdvTutarı;

        System.out.println("Kdvsiz Fiyat : "+kdvsiz);
        System.out.println("Kdvli Fiyat : "+kdvli);
        System.out.println("Kdv Tutarı : "+kdvTutarı);
    }
}
