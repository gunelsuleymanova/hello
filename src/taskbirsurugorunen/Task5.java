package taskbirsurugorunen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task5 {

    public static void main(String[] args) {
        List<Integer> number= new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(4);
        number.add(5);
        System.out.println(number);
        Set<Integer>number1= new HashSet<>(number);
        System.out.println(number1);
    }
}
