import java.util.Scanner;
public class RecursiveMotodİleÜsHesaplama {
    static int sonuc= 1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int us,sayi;
        System.out.println("Sayıyı gir");
        sayi = scan.nextInt();
        System.out.println("Üssü gir");
        us = scan.nextInt();

        System.out.println(üsAl(sayi,us));

    }

    static int üsAl(int a,int u){
        if (a==0)
            return 1;
        else if (u==0)
            return 1;

        sonuc *= a;
        üsAl(a,u-1);

        return sonuc;
    }
}
