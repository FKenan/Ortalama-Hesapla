public class Course {
    Teacher teacher ;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    double genelNot;

    public Course(String name , String code, String prefix){
        this.name=name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.teacher = t;
        }
        else System.out.println("akademisyen atanamadı");
    }

    public void genelNotHesapla(){
        this.genelNot=(this.note*0.8 + this.sozlu*0.2)/2;
    }
}
