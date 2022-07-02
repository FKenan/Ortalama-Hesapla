public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1,Fighter f2 , int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if (checkWeight()){
            System.out.println(isf1First()? f1.name + " ilk vuran" : f2.name + " ilk vuran");
            while(f1.health > 0 && f2.health > 0){
                if (isf1First()){
                    System.out.println("-------  Yeni Round -------");
                    f1.health= f2.hit(f1);
                    if (isWin()) break;
                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                    printScore();
                }
                else{
                    System.out.println("-------  Yeni Round -------");
                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                    f1.health= f2.hit(f1);
                    if (isWin()) break;
                    printScore();
                }
            }
        }
        else System.out.println("Sporcuların ağırlıkları uyuşmuyor");
    }

    public boolean checkWeight(){
        return (f1.weight>=minWeight && f1.weight <= maxWeight) && (f2.weight>=minWeight && f2.weight<=maxWeight);
    }

    public boolean isWin(){
        if (f1.health ==0){
            System.out.println(f2.name + "kazandı");
            return true;
        }
        if (f2.health == 0){
            System.out.println(f1.name +"kazandı");
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("-------");
        System.out.println(f1.name +"kalan can " + f1.health);
        System.out.println(f2.name +"kalan can " + f2.health);
    }

    public  boolean isf1First(){
        double rnd = Math.random() * 100;
        if (rnd >50) return true;
        else return false;
    }
}
