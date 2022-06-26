import java.util.Scanner;
public class text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  mat,kim,fiz,tar,tur,muz;
        float ortalama;
        System.out.println("Matematik Notunuz ? ");
            mat = input.nextByte();

        System.out.println("Kimya Notunuz ? ");
            kim = input.nextByte();

        System.out.println("Fizik Notunuz ? ");
            fiz = input.nextByte();

        System.out.println("Tarih Notunuz ? ");
            tar = input.nextByte();

        System.out.println("Türkçe Notunuz ? ");
            tur = input.nextByte();

        System.out.println("Müzik Notunuz ? ");
            muz = input.nextByte();

        ortalama = (mat+fiz+kim+tar+tur+muz)/6;

        System.out.println(ortalama>60 ? "Sınıfı Geçtiniz Ortalamanız : " + ortalama
                : "Sınıfta Kaldınız Ortalamanız : "+ ortalama);
    }
}
