/*
package tuesdayTaskk;

import java.util.HashMap;
import java.util.Map;

public class All {
    Map<String, Student> stdnt = new HashMap();


    public void addStudent(Student student) {
        stdnt.put(student.getStudentName(), student);
    }


    public String showStudent() {
        return stdnt.toString();
    }


    public double averageScore() {
        int sum = 0;
        for (Student student : stdnt.values()) {
            sum += student.getStudentScore();
        }

        double average = (double) sum / stdnt.size();
        return average;
    }


    public double max() {
        int max = 0;
        for (Student student : stdnt.values()) {
            if (student.getStudentScore() > max) {
                max = student.getStudentScore();
            }
        }
        return max;
    }


    public void tappp(int a) {
        for (Student student : stdnt.values()) {
            if (student.getStudentScore() < a) {
                System.out.println(student.getStudentName());
                // return  student.getStudentName();
            }
        }

    }

    public void scorereturn(String name) {
        for (Student student : stdnt.values()) {
            if (student.getStudentName().equals(name)) {
                System.out.println(student.getStudentScore());
                return;
            }
        }
        System.out.println("Student not found!");
    }


    @Override
    public String toString() {
        return "DB{" +
                "stdnt=" + stdnt +
                '}';
    }


}
*/
