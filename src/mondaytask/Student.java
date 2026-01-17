package mondaytask;

import java.util.ArrayList;
import java.util.List;
public class Student {

    private String name;
    private String surname;
    private int age;
    private static ArrayList<Student> students= new ArrayList<>();
    private List<String> programLanguage= new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public Student(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void addLanguage(String a){
        programLanguage.add(a);
    }



    public List<String> getProgramLanguage(){
        return programLanguage;
    }






    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", programLanguage=" + programLanguage +
                '}';
    }




    public static void Students(Student student){
        try{
            if(student.age>18){
                students.add(student);
                System.out.println("student elave edildi "+student.name );
            } else {
                throw new AgeInvalid("user kicikdir 18 den ");
            }
        if(student.age>18){
            students.add(student);
            System.out.println("student elave edildi "+student.name );
        } else {
            throw new AgeInvalid("user kicikdir 18 den ");
        }

//        else {
//            System.out.println("bu user kicikdir ");
        //  }
    }catch (AgeInvalid s){
            System.out.println(s);
        }






//
//    public static void Students(Student student){
//        if(student.age>18){
//            students.add(student);
//            System.out.println("student elave edildi "+student.name );
//        } else {
//            throw new AgeInvalid("user kicikdir 18 den ");
//        }
//
////        else {
////            System.out.println("bu user kicikdir ");
//      //  }
//    }


//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                ", programLanguage=" + programLanguage +
//                '}';
//    }

//marka ve model clasi olur maekada modelin 5 telefon modeli elave edek




//    public void deleteelement(int a){
//        programLanguage.remove(a);
//    }
//
//    public List<String> getbyage(String name){
//        List<String>list= new ArrayList<>();
//        for(String s: programLanguage){
//            if(s.>age){
//                list.add(s);
//            }
//        }
//        return list;
//    }





    }}
