import java.util.Scanner;
public class ortalama2 {
    public static void main(String[] args) {

        int mat,kim, fiz, tur,toplam = 0;
        double ort;
        Scanner i = new Scanner(System.in);

        System.out.printf("kimya notunuz: ");
        kim= i.nextInt();

        System.out.printf("Fizik notunuz: ");
        fiz= i.nextInt();

        System.out.printf("Türkçe notunuz: ");
        tur= i.nextInt();

        System.out.printf("Matematik notunuz: ");
        mat= i.nextInt();

        if(mat<=100 && mat>=0) toplam += mat;
        if(kim<=100 && kim>=0) toplam += kim;
        if(tur<=100 && tur>=0) toplam += tur;
        if(fiz<=100 && fiz>=0) toplam += fiz;

        ort = toplam /4;
        if (ort>55) System.out.printf("Ortalamanız :"+ort +"  \n Tebrikler Geçtiniz",ort);
        else System.out.printf("Ortalamanız : "+ort + "\n  Kaldınız",ort);
    }
}