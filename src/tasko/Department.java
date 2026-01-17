package tasko;

public class Department {

        String deptName;
        Course course;

        Department(String deptName) {
            this.deptName = deptName;
            System.out.println("Department yaradildi: " + deptName);

            this.course = new Course("OOP");
        }
    }


