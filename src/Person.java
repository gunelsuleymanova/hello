import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return Integer.compare(other.age, this.age);
        }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


            @Override
        public String toString() {
            return "("+name+" (" +age+")";

        }


        public static void main(String[] args) {


            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Charlie", 30));  //P1 30
            persons.add(new Person("Alice", 25));    //P2 25
            persons.add(new Person("Bob", 35));      //P3 35
            persons.add(new Person("David", 25));    //P4 25

            System.out.println( persons);
            System.out.println("==============================");
            Collections.sort(persons);
            System.out.println(persons);



            Collections.sort(persons,new NameComparator());
            System.out.println(persons);
            Collections.sort(persons,new IsimComparator());
            System.out.println(persons);


        }

    }



