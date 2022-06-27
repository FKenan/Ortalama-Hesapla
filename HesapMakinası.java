import java.util.Scanner;
public class HesapMakinası {
    public static void main(String[] args) {
        int n1,n2,islem;

        Scanner inp = new Scanner(System.in);
        System.out.print("ilk sayı");
        n1 = inp.nextInt();
        System.out.print("ikinci sayı");
        n2 = inp.nextInt();
        System.out.println("1- top , 2-çık , 3-çar , 4-böl");
        islem= inp.nextInt();
        switch (islem){
            case 1 :
                System.out.print(n1 + n2);
                break;
            case 2 :
                System.out.print(n1 - n2);
                break;
            case 3 :
                System.out.print(n1 * n2);
                break;
            case 4 :
                System.out.print(n1 / n2);
                break;
        }

    }

}
