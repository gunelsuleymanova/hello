package tasko;

public class University {



        String uniName;
        Department department;

        University(String uniName) {
            this.uniName = uniName;
            System.out.println("University yaradildi: " + uniName);

            this.department = new Department("Computer Science");
        }
    }


