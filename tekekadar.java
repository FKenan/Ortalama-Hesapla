import  java.util.Scanner;
public class tekekadar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,toplam = 0;

       do {
           System.out.printf("Sayı Gir");
            sayi = inp.nextInt();
           if (sayi %2==0 ||sayi%4==0) toplam+= sayi;
       }while (sayi %2==0);

        System.out.printf("Toplam :" +toplam);

    }

}