import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut =2.14,elma=3.67,domates = 1.11,muz=0.95,patlıcan= 5,tutar;

        System.out.println(" Armut kaç kilo ?");
        armut = inp.nextDouble() * armut;
        System.out.println(" Elma kaç kilo ?");
        elma = inp.nextDouble() * elma;
        System.out.println(" Domates kaç kilo ?");
        domates = inp.nextDouble() * domates;
        System.out.println(" Muz kaç kilo ?");
        muz = inp.nextDouble() * muz;
        System.out.println(" Patlıcan kaç kilo ?");
        patlıcan = inp.nextDouble() * patlıcan;

        tutar = armut + muz + elma + patlıcan + domates;

        System.out.println("Toplam turar : " + tutar);
    }
}
