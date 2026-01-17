import java.util.*;

public class Student {
static int count =0;

    private String name;
    private int point;
    private String city;
    public Student(String name,int point,String city){
        this.name=name;
        this.point=point;
        this.city=city;

    }

    public String getName(){
        return name;
    }

    public int getPoint() {
        return point;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", city='" + city + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return name + " (" + point + ")";
//    }


    public static void main(String[] args) {


        List<Student>students=List.of(
                 new Student("gunel",86,"gabala")
                ,new Student("gunay",100,"agdam")
                ,new Student("arzu",90,"shabran"));

//
//boolean varmi= students.stream()
//        .anyMatch(s->s.getCity().equals("gabala"));
//        System.out.println(varmi);


       Student ilktelebe = students.stream()
                .filter(s->s.getPoint()<50)
                .sorted(Comparator.comparing(Student::getName))
                .findFirst()
               .orElse(new Student("Tapılmadı", 0,"city"));
               //.orElse(null);

boolean istirakedib=students.stream().allMatch(s->s.getPoint()>0);
        System.out.println(istirakedib);
        System.out.println(ilktelebe);



        //80 den yuxari olan istifadeciler
//
//        System.out.println("=================================");
//        Map<String,Integer>list1=new HashMap<>();
//        list1.put("gunel",100);
//        list1.put("farid",29);
//        list1.put("gunay",30);
//        list1.put("gulcin",60);
//        list1.put("nigar",80);
//        list1.entrySet().stream()
//                .filter(s->s.getValue()<50 )
//                .forEach(s-> System.out.println("kesildiniz " +s));










//        System.out.println("=================================");
//        Map<String,Integer>list1=new HashMap<>();
//        list1.put("gunel",100);
//        list1.put("farid",29);
//        list1.put("gunay",30);
//        list1.put("gulcin",60);
//        list1.put("nigar",80);
//        list1.entrySet().stream()
//                .filter(s->s.getValue()<50)
//                .forEach((s)-> {
//                    System.out.println("kesildiniz "+s.getKey());
//                    count++;
//                });
//
//        System.out.println("kesilenler sayi "+count);











//        System.out.println("=================================");
//        Map<String,Integer>list1=new HashMap<>();
////        List<String> kAdlar = new ArrayList<>();
//        list1.put("gunel",100);
//        list1.put("farid",29);
//        list1.put("gunay",30);
//        list1.put("gulcin",60);
//        list1.put("nigar",80);
//        list1.entrySet().stream()
//                .filter(s->s.getValue()<50)
//                .map(s-> s.getKey())
//                .toList()
//                .forEach(list1::remove);

//        for(String a : kAdlar){
//            list1.remove(a);
//        }
  //      System.out.println(list1);
//
////        list1.entrySet().stream()
//                .filter(e -> e.getValue() < 50)
//                .map(Map.Entry::getKey)
//                .toList()
//                .forEach(list1::remove);
//
//        System.out.println(list1);

















    }
}
