package fridaytask;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name ;
    private String surname;
    private int age ;
    private static ArrayList<Student> db= new ArrayList<>();
    public Student(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
        db.add(this);    //Yeni bir tələbə obyekti yaradılan kimi, onu dərhal db adlı o ortaq siyahıya (ArrayList) əlavə et."
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List <Student> getStudent(){
        return  db;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void deleteelement(int a){
        db.remove(a);
    }

    public static List<Student >getbyAge(int age ){
        List<Student>list= new ArrayList<>();
        for(Student s: db){
            if(s.getAge() >age ){
                list.add(s);
            }
        }
        return list;
    }


}