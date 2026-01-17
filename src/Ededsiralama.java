import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ededsiralama {
    static int say;
    static int cem=0;
    static int hasil=1;
    static int max=0;
    static String name ="";
    static int min =Integer.MAX_VALUE;
    public static void main(String[] args) {



//
//        List<Integer> list1=List.of(1,2,3,4,4,4,2,6,7);
//        List<Integer>list2=new ArrayList<>();
//        list2.stream()
//                .forEach((s)->s.equals(list2.get(s)));



//        List<Integer> list1=List.of(1,2,3,4,4,4,2,6,7);
//        List<Integer>list2=new ArrayList<>();
//
//
//        list2.stream()
//                .forEach((s)-> list2.contains(s));
//
//        System.out.println(list2);




//
//        List<Integer> list1=List.of(1,2,3,4,4,2,6,4,7);
//        System.out.println( list1.stream()
//                .filter(n -> list1.indexOf(n) != list1.lastIndexOf(n)) // appears more than once
//                .distinct()
//                .toList());



//        List<Integer> list1=List.of(1,2,3,4,4,2,6,4,7);
//        System.out.println(list1.stream()
//
//                .filter(n->list1.indexOf(n)!=list1.lastIndexOf(n))
//                .distinct()
//                .toList()
//
//        );


        //en uzun sozu cixar listden

//        List<String>list2=List.of("gunel","hgsd","asd","as");
//
//        list2.stream()
//                .forEach(s -> {
//                    if(s.length()>max){
//                        max=s.length();
//                        name=s;
//                    }
//                });
//        System.out.println("uzunluq "+max+" soz  "+name);








//
//        List<String>list2=List.of("gunel","hgsd","asd","as");
//        list2.stream()
//                .forEach(a->{
//                    if (a.length()<min){
//                        min=a.length();
//                    }
//                });
//
//        System.out.println(min);



//
//        List<String>list2=List.of("sunsunsunsunsunsun","hgsd","asd","as");
//        System.out.println(list2.stream().limit(3).toList());



//15 elementli soz daxil edib 10 elementini goster





        //listdeki butun elementlerin cemi ve hasili

//        List<Integer>list2=List.of(1,2,3,4);
//        list2.stream()
//                .forEach(s->{
//                    cem+=s;
//                });
//        System.out.println(cem);



//
//        List<Integer>list2=List.of(1,2,3,4);
//
//        list2.stream()
//                .map(n -> {
//                    hasil *= n;
//                    return n;
//                })
//                .toList();
//
//
//
//        list2.stream()
//                        .map(x->{
//                            cem+=x;
//                            return cem;
//                        }).toList();
//
//
//
//
//        list2.stream().count();
//        System.out.println("say "+ list2.stream().count());
//
//
//
//
//        list2.stream().forEach(s->{
//            say++;
//        });
//        System.out.println(say);
//
//
//
//
//        System.out.println("hasil "+hasil);
//        System.out.println("cem "+cem);

























/// icinde method olmayan interface nedir ??????
        //to list yeniden liste qayidir
        //




//        List<String>list11=List.of("gunel","aune","gun","gu","g");
//        list11.stream()
//                .map(x->x.startsWith("a"))
//                .forEach(a-> System.out.println(a.toString().toUpperCase()));


//        List<String>list11=List.of("gunel","aune","gun","gu","g");
//        list11.stream()
//                .filter(s->s.startsWith("a"))
//                .forEach(a-> System.out.println(a.toUpperCase()));


//
//        List<String>list11=List.of("gunel","aune","gun","gu","g");
//        list11.stream()
//                .filter(s->s.startsWith("a"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);



//        List<Integer>listt=List.of(1,2,3,4,5,6,7);
//       List<Integer>cutler=listt.stream()
//               .filter(s->s%2==0)
//               .collect(Collectors.toList());
//        System.out.println(cutler);







//        List<String>list11=List.of("gunel","aune","aun","gu","g");
//       List<String>yeni= list11.stream()
//                .filter(s->s.startsWith("a"))
//                .map(s->s.toUpperCase())
//                .toList();
//        System.out.println(yeni);


//
//        List<Integer> reqemler = List.of(11, 2, 3, 4, 5, 6,11,11,9);
//        List<Integer>tekyenniler=reqemler.stream()
//                .filter(s->s%2!=0)
//                .limit(10)
//                .map(s->s*10)
//                .sorted()
//                .toList();
//        System.out.println(tekyenniler);



//        List<Integer>list1=List.of(10, 5, 10, 2, 8, 5, 3);
//        list1.stream()
//                .distinct()
//                .sorted()
//                .limit(3)
//                .forEach(System.out::println);




//      List<Integer>list1=List.of(15, 20, 10, 5);
//      int bb=list1.stream()
//              .filter(s->s>10)
//              .reduce(0,(a,b)->a+b);
//        System.out.println(bb);



        List<Integer> ballar = List.of(45, 80, 45, 90, 100, 60);
        long a= ballar.stream()
                .distinct()
                .filter(s->s>50)
                .sorted()
                .count();

        System.out.println(a);






    }
}
