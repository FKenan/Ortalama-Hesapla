import java.util.Scanner;
public class giriş {
    public static void main(String[] args) {
        String ad ,sifre;
        Scanner i = new Scanner(System.in);
        System.out.printf("kullanıcı adı");
        ad= i.nextLine();

        System.out.printf("sifre ");
        sifre= i.nextLine();

        if (ad.equals("java") && sifre.equals("123"))
        System.out.printf("giriş yapıldı");
        else System.out.printf("hatalı giriş");
    }
}
