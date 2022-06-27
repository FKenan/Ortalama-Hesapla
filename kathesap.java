import  java.util.Scanner;
public class kathesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,toplam = 0,sayac=0;
        double ort;
        System.out.printf("Kaça Kadar");
        sayi = inp.nextInt();

        for(int i=1 ; i<=sayi ; i++)
        {
            if (i%3==0 || i%4==0) {
                toplam += i;
                sayac++;
            }
        }
        ort= toplam/sayac;
        System.out.printf("Ortalama :" +ort);

    }

}
