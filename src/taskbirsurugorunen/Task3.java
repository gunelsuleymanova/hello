package taskbirsurugorunen;

import java.util.LinkedList;
import java.util.Queue;

public class Task3 {
    private String name;
    public static Queue<Task3> new1 = new LinkedList<>();

    String ad;
    String db;


    public Task3(String name) {
        this.name = name;
        new1.add(this);
    }

    public String getName() {
        return name;
    }


    public static void poli() {
        new1.poll();
        System.out.println("  emeliyyati tamamlandi");
    }

    @Override
    public String toString() {
        return "taskbirsurugorunen.Task3{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Queue<Task3> getNew1() {
        return new1;
    }

    public static void main(String[] args) {


        Task3 new2 = new Task3("gunel");
        Task3 new3 = new Task3("gunay");
        Task3 new4 = new Task3("nigar");


        System.out.println(new1);

        while (!new1.isEmpty()) {
            poli();


        }
    }
}
