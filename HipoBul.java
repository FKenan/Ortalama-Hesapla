import  java.util.Scanner;
public class HipoBul {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int aKenarı,bKenarı;
        double cKenarı;

        System.out.println("a keanrını yazınız ");
        aKenarı = inp.nextInt();

        System.out.println("b keanrını yazınız ");
        bKenarı = inp.nextInt();

        cKenarı =Math.sqrt(aKenarı*aKenarı + bKenarı*bKenarı);

        System.out.println("Hipotenüs : "+ cKenarı);

    }
}
