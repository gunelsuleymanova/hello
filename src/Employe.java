import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employe {
static int counter =0;
static int sum=0;

    public static void main(String[] args) {


        Map<String,Map<String,Integer>>corperate=new HashMap();

        Map<String,Integer>employee1=new HashMap<>();
        employee1.put("Gunel", 1000);
        employee1.put("Charli", 1200);
        employee1.put("Luca", 1400);


        Map<String,Integer>employee2=new HashMap<>();
        employee2.put("Elvin", 1500);
        employee2.put("Maria", 1100);
        employee2.put("Sophie", 1200);
        employee2.put("Kenji", 1600);


        Map<String,Integer>employee3=new HashMap<>();
        employee3.put("John", 1300);
        employee3.put("Aysel", 1000);
        employee3.put("Ali", 900);


        corperate.put("IT",employee1);
        corperate.put("Finance",employee2);
        corperate.put("HR",employee3);

        List<String>list1=new ArrayList<>();

        corperate.entrySet().stream()
                .filter(s->s.getKey().equals("HR"))
                .forEach(s-> {
                   s.getValue()
                           .entrySet().stream()
                           .filter(
                                   (e) -> e.getValue() < 1000
                           )
                           .forEach((e) -> {

                       counter  = s.getValue().size();
                       System.out.println(e);

                       list1.add(e.getKey());
                   });
//                 System.out.println(s);
        });
        System.out.println(counter);
        System.out.println(list1);






//
//
//        corperate.entrySet().stream()
//                .forEach(s->s.getValue().entrySet().stream().filter(d->d.getValue()>1000).forEach(f-> {
//
//                    counter+=f.getValue();
//                    System.out.println(f);
//                }));
//
//
//        System.out.println("umumi maas ="+counter);








//
//
//for (String s:list1){
//    corperate.get("HR").remove(s);
//}
//
//        System.out.println(corperate);







//
//        employee3.entrySet().stream()
//                        .forEach(s-> System.out.println(s));


//        corperate.entrySet().stream()
//                .filter(s->s.equals("HR")).toList().stream()
//                .filter(s->s.getValue()
//                        .containsKey("employee3"))
//                        .forEach(System.out::println);






//        corperate.entrySet().stream()
//                .filter(s->s.getKey().equals("HR")).toList().stream().forEach(s-> {
//                    System.out.println(s);
//                    count++;
//                });
//        System.out.println(cou);

//
//        corperate.entrySet().stream()
//                .filter(s->s.getKey().equals("HR"))
//                .map(e->e.getValue().size())
//                .forEach(System.out::println);





//        corperate.entrySet().stream()
//                .filter(e -> e.getKey().equals("HR"))   // yalnız HR
//                .findFirst()                            // HR-ni tap
//                .ifPresent(e ->
//                        e.getValue().entrySet().stream().filter(s->s.getValue()>1000)
//                                .forEach(emp -> {
//                                    counter++;
//                                    System.out.println(counter + ". " + emp.getKey()+ " = " + emp.getValue()
//                                            );
//                                        }
//                                )
//                );



//        corperate.entrySet().stream().filter(s->s.getKey().equalsIgnoreCase("hr"))
//                .findFirst().ifPresent(s->s.getValue().entrySet().stream().forEach(a->{
//                            sum+=a.getValue();
//                    System.out.println(a.getValue()+" "+a.getKey());
//
//                        }
//                ));
//        System.out.println(sum);






//                corperate.entrySet().stream().forEach(entry -> {
//                    double avg = entry.getValue().values().stream()
//                            .mapToInt(Integer::intValue)
//                            .average()
//                            .orElse(0);
//                    System.out.println(entry.getKey() + " departamenti orta maaş: " + avg);
//                });











//        List<String>list1=new ArrayList<>();
//        corperate.entrySet().stream()
//                .filter(s->s.getKey().equalsIgnoreCase("hr"))
//                .findFirst().ifPresent(d->d.getValue().entrySet().stream()
//                        .filter(f->f.getValue()<1000).toList()
//                        .forEach(a->{
//                    list1.add(a.getKey());
//                }));
//        System.out.println(list1);
//
////        for(Map.Entry<String,Map<String,Integer>>entry:corperate.entrySet()){
////
////        }
//        for(String s:list1){
//            corperate.
//        }
//        System.out.println(corperate);
    }
}
