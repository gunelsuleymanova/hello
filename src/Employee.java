import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private double salary;
    public Employee(String name , double salary){
        this.name=name;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }






    public static void main(String[] args) {
        System.out.println("===========================");

        Employee e1= new Employee("Gunel",1000);
        Employee e2= new Employee("Flynn",3000);
        Employee e3= new Employee("Gabriella",4000);
        List<Employee> list= new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        System.out.println(list.stream()
                .filter(s->s.getSalary()>3000)
                .map(d->d.getName())
                .toList()
        );



    }




}
