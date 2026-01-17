import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Humann implements Comparable<Humann>{

    private String name ;
    private Integer age ;
    private Integer balance;


    public Humann(String name, Integer age,Integer balance) {
        this.name = name;
        this.age = age;
        this.balance=balance;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Humann{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Humann o) {
        return Integer.compare(this.age,o.age);
    }


   public static void main() {


       Humann h1 = new Humann("gunel", 10, 23);
       Humann h2 = new Humann("arzu", 10, 34);
       Humann h3 = new Humann("gunay", 30, 32);


       List<Humann> list1 = new ArrayList<>();
       list1.add(h3);
       list1.add(h1);
       list1.add(h2);
//
//
//       Collections.sort(list1);
//       System.out.println(list1);
       System.out.println(list1);
//       Collections.sort(list1,new AgeComperator());
//       System.out.println(list1);
       System.out.println("====================");
       //Collections.sort(list1,new BalanceComperatorrr());
       // System.out.println(list1);


       list1.sort(Comparator.comparing(Humann::getAge).thenComparing(Humann::getBalance));


       System.out.println(list1);


//
//       list1.sort(Comparator.comparing(Humann::getAge)
//
//               .thenComparing(Humann::getBalance)
//       );


   }

}
