import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Canta implements Iterable<String>{
    private String[] kitaplar={"java","algoritm","dataalay"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                // Sence burada kitap dizisinin sonuna gelip gelmediğimizi nasıl kontrol ederiz?
                return index < kitaplar.length;
            }

            @Override
            public String next() {
                // Sıradaki kitabı döndürüp indeksi bir artırmamız lazım.
                return kitaplar[index++];
            }
        };
    }
//
//    @Override
//    public Iterator<String> iterator() {
//        return CantaIterator();
//    }
//
//    @Override
//    public void forEach(Consumer<? super String> action) {
//        Iterable.super.forEach(action);
//    }
//
//    @Override
//    public Spliterator<String> spliterator() {
//        return Iterable.super.spliterator();
//    }
}
