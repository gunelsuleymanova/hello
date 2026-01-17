import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task212 {
static  int cem=0;

    public static void main() {

        List<Integer> list1 = List.of(1, 2, 3, 4, 6);
        List<Integer> list2 = List.of(2, 8, 10, 12, 14);


//List<Integer> listbirlesme= Arrays.asList(list1,list2).stream().flatMap((s) -> s.stream()).filter(a->a%2==0).toList();;
        //List<Integer> listbirlesme= Arrays.asList(list1,list2).stream().flatMap(s->s.stream().count());
//        int b=listbirlesme.stream().flatMap(s->s.describeConstable().stream().count();


//
//        long cutlerinSayi = Stream.of(list1, list2)
//                .flatMap(List::stream)
//                .forEach(s->{
//                    if(s>max){
//                        max=s;
//                    }
//                });


//
//        int max = Stream.of(list1, list2)
//                .flatMap(List::stream)
//                .max(Integer::compareTo)
//                .orElseThrow();
//
//        System.out.println(max);


//
//
//        Stream.of(list1, list2)
//                .flatMap(List::stream)
//                .forEach(s -> {
//                    if (s > max) {
//                        max=(s);
//                    }
//                });
//        System.out.println(max);
//


//
//        List<String>list11=List.of("qqqq","ww","eeeeeee");
//        List<String>list22=List.of("aaaa","ddd","qwert");
//
//        List<String> list33 = Stream.of(list11, list22)
//        Stream.of(list1, list2)
//                .flatMap(List::stream)
//                .forEach(s -> {
//                    if (s.length() > longest.get().length()) {
//                        longest.set(s);
//                    }
//                });


        List<String> list11 = List.of("alma", "banan", "heyva");
        List<String> list22 = List.of("almaaaa", "bahhhnan", "hkjeyva");








    }}

//
//        List<String> list44 = Stream.of(list11, list22)
//                .flatMap(List::stream)
//                .map(s -> {
//                    if (s.length() > 5) {
//                        cem+=s.length();
//                        return s.substring(0, 1).toUpperCase().concat(s.substring(1));
//                    }
//                    return s;
//                })
//                .toList();
//
//        System.out.println(list44);
//        System.out.println(cem);
//    }










//        Stream.of(list11, list22)
//                .flatMap(List::stream)
//                .forEach(s -> {
//
//                });





//
//        System.out.println(cutlerinSayi);
//        System.out.println("=====================");
        //System.out.println(listbirlesme);

//stringlerin olculerin tap uzunlugu 5 den boyuk olanlarin ilk elementi boyut yaz