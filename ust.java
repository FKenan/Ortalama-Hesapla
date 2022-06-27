import  java.util.Scanner;
public class ust {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, us, toplam=1;

        System.out.printf("sayıyı gir");
        sayi = inp.nextInt();

        System.out.printf("üs gir");
        us = inp.nextInt();

        for (int i=1;i<=us;i++){
            toplam *=sayi;
        }

        System.out.printf("sonuc :" + toplam);

    }
}