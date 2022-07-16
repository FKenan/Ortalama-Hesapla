public class Liste<T> {

    private T[] dizi;

    public Liste() {
        // Dizi boyutu ayarlandı
        this.dizi = (T[]) new Object[10];
    }

    public Liste(int capacity) {
        // Dizi boyutu ayarlandı
        this.dizi = (T[]) new Object[capacity];
    }

    public int getCapacity() {
        return dizi.length;
    }

    // Dizideki eleman sayısını verir
    public int size() {
        int size = 0;
        for (T a : this.dizi) {
            if (a != null)
                size++;
        }
        return size;
    }

    // Diziye eleman ekler
    public void add(T data) {
        // Dizideki eleman sayısı kapasiteye eşitse kapastiyi iki katına çıkar
        if (this.size() == getCapacity()) {
            T[] a = (T[]) new Object[getCapacity() * 2];
            System.arraycopy(dizi, 0, a, 0, dizi.length);
            this.dizi = a;
        }
        for (int i = 0; i < this.dizi.length; i++) {
            if (this.dizi[i] == null) {
                this.dizi[i] = data;
                break;
            }
        }
    }

    // Indexi verilen elemanı verir
    public T get(int index) {
        // Verilen index dizi boyutu içindeyse değeri geri döner.Değilse dizinin boyutu dışında bir değer girilmiştir, hata fırlatır.
        try {
            return this.dizi[index];
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Girdiğiniz index bulunamadı");
        }
    }

    public void remove(int index) {
        try {
            for (int i = index; i < size(); i++) {
                this.dizi[i] = this.dizi[i + 1];
            }

        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Girdiğiniz index bulunamadı");
        }
    }

    public void set(int index, T data) {
        try {
            dizi[index] = data;
        } catch (Exception e) {
            System.out.println("Girdiğiniz index bulunamadı");
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < size(); i++) {
            System.out.println(dizi[i]);
        }
        return"";
    }

    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (dizi[i] == data)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i =size();i<=0 ;i--){
            if(dizi[i].equals(data))
                return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        this.dizi = (T[]) new Object[10];
    }

    public Liste<T> sublist(int start, int finish) {
        Liste<T> a = new Liste<>();
        for (int i = start; i <= finish; i++) {
            if (dizi[i] != null)
                a.add(dizi[i]);
        }
        return a;
    }

    public boolean contains(T data){
        for(int i =0;i<size();i++){
            if (dizi[i].equals(data))
                return true;
        }
        return false;
    }
}
