import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Human {
static int say=0;
    private String name;
    private String country;


    public Human(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Human h1=new Human("Gunel","Azerbaijan");
        Human h2=new Human("Charli","UK");
        Human h3 = new Human("Elvin", "Turkey");
        Human h4 = new Human("Maria", "Spain");
        Human h5 = new Human("John", "USA");
        Human h6 = new Human("Aysel", "Azerbaijan");
        Human h7 = new Human("Luca", "Italy");
        Human h8 = new Human("Sophie", "France");
        Human h9 = new Human("Ali", "Pakistan");
        Human h10 = new Human("Kenji", "Japan");

        List<Human>humans=List.of(h1,h2,h3,h4,h5,h6,h7,h8,h9,h10);
        //Map<String, Integer> countryCount = new HashMap<>();

//
//        for(Human d: humans){
//            String a = d.getCountry();
//            countryCount.put(a,countryCount.getOrDefault(a,0)+1);
//        }
//
//
//
//        for(Map.Entry<String,Integer>entry:countryCount.entrySet()){
//            System.out.println(entry.getKey()+" "+" "+entry.getValue());
//        }


//        Map<String, Long> Map1 = humans.stream()
//                .collect(Collectors.groupingBy(Human::getCountry, Collectors.counting()));

//
//        Map<String,Long>maps=humans.stream()
//                .sr
//
//
//        // Ekrana yazdır
//        Map1.forEach((c, s) ->
//                System.out.println(c + " " + s)
//        );

        //tapsiriq
        // bir clas vavr icinde country var ,human clasidir human hansi countrydendir .bu list olsun ekrana cixsiinki hansi ollkeden nece insan var .


//countr ve adi var listin icine adamlari yig .ekrana cixsinki azerbaycandan 3 meselen britanyadan 10 insan var


        Map<String ,String >map1=new HashMap<>();
        map1.put("username", "user");
        map1.put("name","farid");
        map1.put("lastname","qwret");
        map1.put("lastname","hajiyev");
        System.out.println(map1);



//
//        for(var m:map1.entrySet()){
//            if(m.getKey().equalsIgnoreCase("username")){
//                System.out.println(m.getValue());
//            }
//            else {
//                System.out.println(m.getKey());
//            }
//        }




//        for(var m: map1.entrySet()){
//            System.out.println(m.getValue()+"  "+m.getKey());
//        }
//        for(Map.Entry<String,String> m:map1.entrySet()){
//            System.out.println(m.getValue());
//        }


        System.out.println("===========================");

//        Map<String,List<Map<String,String>>> map2= new HashMap<>();
//
//        Map<String ,String>map22=new HashMap<>();
//        map22.put("name","Ali");
//        map22.put("surname","Ibrahimov");
//        Map<String,String>map33=new HashMap<>();
//        map33.put("name","Narmin");
//        map33.put("surname","Muradli");
//
//        List<Map>list1=new ArrayList<>();
//        list1.add(map22);
//        list1.add(map33);
//        System.out.println(list1);
//        map2.put("IT",list1);

        Map<String,List<Map<String,String>>> map2= new HashMap<>();

        Map<String ,String>map22=new HashMap<>();
        map22.put("name","Ali");
        map22.put("surname","Ibrahimov");
        Map<String,String>map33=new HashMap<>();
        map33.put("name","Narmin");
        map33.put("surname","Muradli");

        List<Map<String,String>>list1=new ArrayList<>();
        list1.add(map22);
        list1.add(map33);
        System.out.println(list1);
        map2.put("IT",list1);
        System.out.println(map2);
        System.out.println("-----------------");

        map2.entrySet().stream()
                .forEach(a->a.getValue().forEach(s->s.entrySet().forEach(w->
                {
                    say++;
                    System.out.println(w);
                })));

        System.out.println(say);
//        map2.entrySet().stream().forEach(a-> a.getValue()
//                .stream().forEach(s->s.entrySet().stream()
//                        .forEach(d-> System.out.println(d))));
//
//        System.out.println("==========");
//
//        for(var ss;map22.entrySet()){
//            System.out.println(ss);
//        }
//
//
//        //Function<Integer ,Integer>
//
//        nonacces modifier final static abstract synchornized  transient ,
//        instance of
//                wild card =namelum tip
//                findany=paralele axinlarda ilki tapir
//                iki axin flatmapda
//                java platformadan asli olmayan oop
//                jit jvm isini suretlendiri asanlasdirim
//
//
//
//
//
//                1 den 100 10 vur 100den boyukleri capa ver


//      map2.entrySet().stream()
//              .forEach(a-> System.out.println(a.getValue().stream().flatMap(s->s.entrySet().stream().forEach(d-> System.out.println(d.getValue())))));













    }
    }
