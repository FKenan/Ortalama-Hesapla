public class Student {
    String name;
    String stuno;
    Course mat;
    Course kim;
    Course fiz;
    Double avarage;
    boolean isPass;

    public Student(String name,String stuno,Course mat, Course kim, Course fiz){
        this.name = name;
        this.stuno= stuno;
        this.mat = mat;
        this.kim = kim;
        this.fiz = fiz;
    }

    public void calcAvarage(){
        this.avarage = (double)(this.mat.genelNot + this.fiz.genelNot + this.kim.genelNot)/3;
    }

    public void  addBulkExamNote(int mat, int fiz, int kim,int matsoz,int fizsoz,int kimsoz){
        if (mat>=0 && mat<=100) this.mat.note = mat;
        if (fiz>=0 && fiz<=100) this.fiz.note = fiz;
        if (kim>=0 && kim<=100) this.kim.note = kim;
        if (matsoz>=0 && matsoz<=100) this.kim.sozlu = matsoz;
        if (fizsoz>=0 && fizsoz<=100) this.kim.sozlu = fizsoz;
        if (kimsoz>=0 && kimsoz<=100) this.kim.sozlu = kimsoz;
    }
    public void isPass(){
        if (this.mat.genelNot == 0 || this.fiz.genelNot == 0 || this.kim.genelNot == 0){
            System.out.println("Tüm notlar girilmemiş");
        }
        else{
            this.isPass =checkIsPass();
            printNote();
            System.out.println("ortalma "  + this.avarage);
            if (this.isPass) System.out.println("Geçti");
            else System.out.println("Kaldı");
        }
    }

    public boolean checkIsPass(){
        calcAvarage();
        return this.avarage >55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.genelNot);
        System.out.println("Fizik Notu : " + this.fiz.genelNot);
        System.out.println("Kimya Notu : " + this.kim.genelNot);
    }
}
