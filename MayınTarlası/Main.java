package MayınTarlası;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int col, row;

        MineSweeper a = new MineSweeper(4, 3);
        a.run();

        do {
            System.out.println();
            System.out.println("Satır seçiniz");
            row = scan.nextInt();
            System.out.println("Sütun seçiniz");
            col = scan.nextInt();

            if (!(row>a.rowCount || row <0) || (col>a.colCount || col <0))
                System.out.println("Satır yada Sütun sayısının dışına çıkıldı");

            if (a.mayinKonum[row][col] == "*") {
                a.gameOver();
                break;
            } else if (a.mayinKonum[row][col] == "_"){
                int mineCount =a.checkNearMinesCount(row,col);
                a.updateTarla(row,col,mineCount);
                a.showTarla();
            }else System.out.println("geçersiz işlem yapıldı");


        } while (a.isWin() == false);
    }
}
