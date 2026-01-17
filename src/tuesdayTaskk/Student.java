package tuesdayTaskk;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String studentName;
    private int studentScore;

    public Student(String studentName, int studentScore) {
        this.studentName = studentName;
        this.studentScore = studentScore;
    }


    public String getStudentName() {
        return studentName;
    }

    public int getStudentScore() {
        return studentScore;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentScore == student.studentScore && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentScore);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentScore=" + studentScore +
                '}';
    }
}
