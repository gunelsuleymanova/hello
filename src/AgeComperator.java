import java.util.Comparator;

public class AgeComperator implements Comparator <Humann> {


    @Override
    public int compare(Humann o1, Humann o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
