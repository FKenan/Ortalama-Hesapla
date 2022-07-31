import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("A kitabı",80,"A yazarı",1980));
        books.add(new Book("B kitabı",120,"B yazarı",1981));
        books.add(new Book("C kitabı",110,"C yazarı",1982));
        books.add(new Book("D kitabı",130,"D yazarı",1983));
        books.add(new Book("E kitabı",70,"E yazarı",1984));
        books.add(new Book("F kitabı",150,"F yazarı",1985));
        books.add(new Book("G kitabı",160,"G yazarı",1986));
        books.add(new Book("H kitabı",170,"H yazarı",1987));

        LinkedHashMap<String,String> a = new LinkedHashMap<>();
        books.stream().forEach(i -> a.put(i.getKitapIsmi(),i.getYazarIsmi()));

        ArrayList<Book> b = new ArrayList<>();
        books.stream().filter(i -> i.getSayfaSayisi()>100).forEach(c -> b.add(c));

    }

}
