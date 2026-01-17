package tasko;

public class Course {

        String courseName;
        Instructor instructor;

        Course(String courseName) {
            this.courseName = courseName;
            System.out.println("Course yaradildi: " + courseName);

            this.instructor = new Instructor("Ali muellim");
        }
    }


