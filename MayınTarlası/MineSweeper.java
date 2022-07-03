package MayınTarlası;

public class MineSweeper {

    int rowCount;
    int colCount;
    int mayinSayisi;
    int acılmayanAlan;
    String[][] tarla;
    String[][] mayinKonum;

    public MineSweeper(int rowCount, int colCount) {
        this.colCount = colCount;
        this.rowCount = rowCount;
        this.mayinSayisi = (this.colCount * this.rowCount) / 4;
        this.acılmayanAlan = this.colCount * this.rowCount;
    }

    public void run() {
        this.tarla = new String[this.rowCount][this.colCount];
        this.mayinKonum = new String[this.rowCount][this.colCount];
        createMines(this.mayinSayisi);      //  mayın konumlarını oluşturma
        fillMayinKonum();                   //  mayınKonum tablosunu doldurma
        showMayinKonum();                   //  mayın konumlarını yazdır
        fillTarla();                        //  oyun alanını oluşturma
        showTarla();                        // oyun alanını yazdırır
    }

    public void showMayinKonum() {               //  mayın konumlarını tutan diziyi ekrana yazdırma
        for (int i = 0; i < this.mayinKonum.length; i++) {
            for (int j = 0; j < this.mayinKonum[i].length; j++) {
                System.out.printf(this.mayinKonum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("============");
        System.out.println();
    }

    public void showTarla() {               //  oyun alanını gösterir
        for (int i = 0; i < this.tarla.length; i++) {
            for (int j = 0; j < this.tarla[i].length; j++) {
                System.out.printf(this.tarla[i][j]);
            }
            System.out.println();
        }
    }

    public void createMines(int count) {            //  mayın konumlarını belirleme
        while (count > 0) {
            int row = (int) (Math.random() * this.rowCount);
            int col = (int) (Math.random() * this.colCount);

            if (this.mayinKonum[row][col] == null) {
                this.mayinKonum[row][col] = "*";
                count--;
            }
        }
    }

    public void fillMayinKonum() {                   //  belirlenen mayın konumlarının haricindeki yerleri doldurma
        for (int i = 0; i < mayinKonum.length; i++)
            for (int j = 0; j < mayinKonum[i].length; j++) {
                if (mayinKonum[i][j] == null)
                    mayinKonum[i][j] = "_";
            }
    }

    public void fillTarla() {               //      oyun ekranınında gösterilecek tarla dizisini doldurma
        for (int i = 0; i < this.tarla.length; i++)
            for (int j = 0; j < this.tarla[i].length; j++)
                this.tarla[i][j] = "_";
    }

    public int checkNearMinesCount(int row , int col){
        int mineCount=0;

        if (row+1<this.rowCount)
            if (this.mayinKonum[row+1][col] == "*")
                mineCount++;
        if (row-1>=0)
            if (this.mayinKonum[row-1][col] == "*")
                mineCount++;
        if (col+1 <this.colCount)
            if (this.mayinKonum[row][col+1] == "*")
                mineCount++;
        if (col-1 >=0)
            if (this.mayinKonum[row][col-1] == "*")
                mineCount++;
        if (row+1<this.rowCount && col+1 <this.colCount)
            if (this.mayinKonum[row+1][col+1] == "*")
                mineCount++;
        if (row-1>=0 && col-1 >=0)
            if (this.mayinKonum[row-1][col-1] == "*")
                mineCount++;

        return mineCount;
    }

    public void updateTarla(int row, int col ,int mineCount){
        this.tarla[row][col] = String.valueOf(mineCount);       // String.valueOf ile stringe çevirdik
        this.acılmayanAlan--;
    }

    public boolean isWin() {
        if(this.acılmayanAlan == this.mayinSayisi){
            System.out.println("***TEBRİKLER KAZANDINIZ***");
            return true;
        }
        return false;
    }

    public void gameOver() {
        System.out.println("Oyunu kaybettiniz");
    }
}