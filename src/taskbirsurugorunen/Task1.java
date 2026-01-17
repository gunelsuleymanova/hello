package taskbirsurugorunen;

import java.util.LinkedList;
import java.util.Queue;

public class Task1 {

    public static void main(String[] args) {

        Queue<Integer>numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.poll();
        System.out.println(numbers);
        System.out.println(numbers.peek());

    }

}
