public class Main {
    public static void main(String[] args) {
        Liste<Integer> l = new Liste<>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);


        var a=l.toArray();
        //System.out.println(a[2]);
    }


}
