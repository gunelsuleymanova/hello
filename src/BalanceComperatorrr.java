import java.util.Comparator;

public class BalanceComperatorrr implements Comparator<Humann> {
//    @Override
//    public int compare(Object o1, Object o2) {
//        return Integer.compare(o1.bal)
   // }

    @Override
    public int compare(Humann o1, Humann o2) {
        return Integer.compare(o1.getBalance(),o2.getBalance());
    }
}
