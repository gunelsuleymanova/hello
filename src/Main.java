import taskbirsurugorunen.Task2;
import taskbirsurugorunen.Task3;
//import tuesdayTaskk.All;
//import tuesdayTaskk.DB;
import tuesdayTaskk.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.LinkedList;
import java.util.function.Function;

import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.SUNDAY;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
   public static void main(String[] args) throws IOException {
//
//
//////
//////       var qaz = new Azerqaz("gullu",100);
//////       var su = new Azersudept("1122",200);
//////       var h1= new Humant<Azersudept>(su,"gulca","lolo");
//////       var h2= new Humant<>(qaz,"vusal","lklk");
//////       var isiq = new Azerisiq();
//////       //CustomMap <Integer,String> mymap= new CustomMap<>(21,"ppp");
//////       CustomMap <String,Azerqaz> mymap= new CustomMap<>("lolo",qaz);
//////       Task1 new1= new Task1();
//////       new1.getir(120);
//////       new1.getir("qwqw");
////
////
//////
//////       Task2 <> new1= new Task2<>(12);
//////       new1.setMessage("2323");
//////       System.out.println(new1.get());
////
////
//////
//////       Task2 <> new2= new Task2<>(12);
//////       new2.setMessage(12);
//////       new2.setMessage("12312");
//////       var new3= new Task2<>(12);
////
//////       String [] kpl={"Java","C++","Python"};
//////       String [] kmn={"qq","ww"};
//////       Student <String,Integer> new1= new Student<>("gunel",12,kpl);
//////
//////       new1.info();
//////       new1.getAge();
//////       System.out.println("==========================================================================");
//////       //new1.setKpl(kmn);
//////       new1.info();
//////       Student <String,Integer> new2= new Student<>("arzu",23,kmn);
//////       new2=new1;
//////       new2.info();
//////
////
//////
//////       Task12 new11= new Task12();
//////       boolean okay=true;
//////
//////     try{
//////             new11.login("gunel", "salam");
//////         throw new Methodfalse("method sevdir ");
//////
//////     }catch (Methodfalse n){
//////         System.out.println(n.getMessage());
//////     }
////
////
/////// evde bax buna if else falan
////
//////
//////       Random eded1= new Random();
//////       int eded2= eded1.nextInt(0,10);
//////       System.out.print("Eded daxil eidn :");
//////       Scanner input = new Scanner(System.in);
//////       int can=5;
//////
//////       while (can>0){
//////       int a=input.nextInt();
//////       try{
//////           if(a==eded2){
//////               System.out.println("Eded dogrudur");
//////               //break;
//////           }
//////           else {
//////               throw new Sehvede("Sehv eded :"+a);
//////           }
//////       }catch (Sehvede n){
//////           System.out.println(n.getMessage());
//////           System.out.println("random eded "+eded2);
//////       }
//////       can--;
//////           System.out.println("haqq sayi "+can);
//////
//////           }
//////   }
//////
//////
//////       }
////
////
//////       Random eded1= new Random();
//////       int eded2= eded1.nextInt(0,10);
//////       System.out.print("Eded daxil eidn :");
//////       Scanner input = new Scanner(System.in);
//////       int can=4;
//////       int ikinci=0;
//////       while (can>0){
//////           int a=input.nextInt();
//////           if(a!=ikinci) {
//////               try {
//////                   if (a == eded2) {
//////                       System.out.println("Eded dogrudur");
//////                       //break;
//////                   } else {
//////                       throw new Sehvede("Sehv eded :" + a);
//////                   }
//////               } catch (Sehvede n) {
//////                   System.out.println(n.getMessage());
//////                   System.out.println("random eded " + eded2);
//////               }
//////
//////               can--;
//////               System.out.println("haqq sayi " + can);
//////           }
//////           else {
//////               System.out.println("eyni eded daxil eidlib");
//////           }
//////           ikinci=a;
////
////
//////       Random eded1= new Random();
//////       int eded11=eded1.nextInt(1,10);
//////       Scanner input= new Scanner(System.in);
//////       System.out.println("Eded daixl edin ");
//////       int [] ededs=new int [5];
//////       int index=0;
//////       int heel=3;
//////       boolean okay=false;
//////       System.out.println(eded11);
//////       while(heel>0) {
//////           int a = input.nextInt();
//////           if (eded11 == a) {
//////               System.out.println("eded tapildi ");
//////               okay=true;
//////           } else {
//////               if(!okay){
//////                   ededs[index]=a;
//////
//////               }
//////               if(!okay){
//////                   for(int s : ededs){
//////                       if(s==a){
//////
//////                       }
//////                   }
//////               }
//////               heel--;
//////               System.out.println("eded tapilmadi ");
//////           }
//////
//////       }
////
//////bunun array formasin yaz evde ..
////
//////
//////            Random eded = new Random();
//////       int eded1= eded.nextInt(1,10);
//////       System.out.println("ede daxil et");
//////       Scanner input = new Scanner(System.in);
//////       int[] ededs= new int[4];
//////       int index=0;
//////       int heal=4;
//////       boolean okay=false;
//////
//////       while(heal>0){
//////           int a=input.nextInt();
//////           try{
//////               for(int f : ededs){
//////                   if(f==a){
//////                       okay = true;
//////                       break;
//////                   }
//////               }
//////               if(okay){
//////                   System.out.println("bu ede daxil olunub");
//////                   okay=false;
//////                   continue;
//////               }
//////
//////           if(a==eded1){
//////               System.out.println("eded dogrudur ");
//////           }
//////           else {
//////               ededs[index]=a;
//////               index++;
//////               throw new Sehvede("sehv eded ");
//////
//////           }}catch (Sehvede m){
//////               System.out.println(m.getMessage());
//////           }
//////          heal--;
//////       }
//////
////////       Subclass new1= new Subclass();
////////       System.out.println(new1.qaytar("gunel"));
//////       Subclass1 new2=new Subclass1();
//////       System.out.println(new2.qaytar(165));
////
//////
//////       Payment <String> new1= new CardPayment();
//////       System.out.println(new1.pay("89"));
//////       Payment<Integer> new2= new CashPayment();
//////       System.out.println(new2.pay(67));
////
////
//////
//////       Repository<User> userrepo= new UserRepository();
//////       User gunel= new User("gunel");
//////       userrepo.save(gunel);
//////       userrepo.save(new User("gunell"));
//////
//////       Repository<Product> new2= new ProductRepository();
//////       new2.save(new Product("macbook"));
////
//////        Random eded = new Random();
//////        int ededf = eded.nextInt(1, 10);
//////        Scanner input = new Scanner(System.in);
//////        System.out.println("ededi daxil edin please ");
//////        int[] ededsl = new int[4];
//////        int index = 0;
//////        boolean okay = false;
//////        int heal = 4;
//////        while (heal > 0) {
//////            int eded1=input.nextInt();
//////            try {
//////                for(int a:ededsl){
//////                    if(a==eded1){
//////                        okay=true;
//////                    }
//////                }
//////                if(okay){
//////                    okay=false;
//////                    System.out.println("eded evvelceden daxil edilib");
//////                    System.out.println("qalan haqq "+heal);
//////                    continue;
//////                }
//////
//////                if(eded1==ededf){
//////                    System.out.println("eded tapildi tebrikler ");
//////                    break;
//////                }
//////                else {
//////                    ededsl[index]=eded1;
//////                    index++;
//////                    heal--;
//////                    throw new Sehvede("eded dogru deyil");
//////                }
//////
//////            }catch (Sehvede n){
//////                System.out.println(n.getMessage());
//////                System.out.println("random eded "+ededf);
//////                System.out.println("qalan caniniz "+heal);
//////            }
//////
//////        }
////
////
//////        int [] arry={1,2,3,4,5};
//////        System.out.println("ededi daxil edin ");
//////        Scanner input= new Scanner((System.in));
//////        int a= input.nextInt();
//////        boolean okay=false;
//////        try {
//////            for(int b: arry){
//////                if(b==a){
//////                    System.out.println("eded varmis ");
//////                    okay = true;
//////                    //break;
//////                }
//////            }
//////            if(!okay){
//////                throw new Sehvede("eded yox imis ");
//////
//////            }
//////
//////
//////
//////
//////        }catch (Sehvede m){
//////            System.out.println(m.getMessage());
//////        }
////
////        //Taskbir<String> new1= new <String > Taskbir();
//////        Taskbir<String> new1= new Taskbir<>("gunel");
//////        System.out.println( new1.info());
////
////
//////
//////
//////
//////        Scanner input= new Scanner(System.in);
//////        System.out.println("texti daxil eidn");
//////        int haqq=5;
//////        while (haqq>0) {
//////            String text = input.nextLine();
//////            try {
//////                Integer a = Integer.parseInt(text);
//////                System.out.println(a);
//////                break;
//////
//////            } catch (NumberFormatException n) {
//////                haqq--;
//////                System.out.println(n.getMessage());
//////                System.out.println("qalan haqq "+haqq);
//////
//////            }
//////
//////        Phone[] phone ={
//////                new Phone("samsung ",100),
//////                new Phone("iphone",200)
//////        };
//////
//////        Marka new3= new Marka("samsung",phone);
////        // System.out.println(new3.getPhone());
////        //System.out.println(new3.getPhone().toString());
////        //System.out.println(new3.getPhone());
////        // System.out.println(new3);
//////        new3.info();
//////        ArrayList<String> new1= new <String> ArrayList;
//////        new1.add("kkk");
//////        System.out.println(new1);
////
////
////        //new3.info();
////        //System.out.println(new3);
/////*
////jihrfuieryuiyertu
////
////*/
////
////
//////
//////
//////        List<String> li= new ArrayList<>();
//////        li.add("alma");
//////        li.add("banan");
//////        li.add("uzum");
//////        System.out.println(li);
//////        System.out.println(li.get(2));
//////        li.remove(1);
//////        System.out.println(li);
//////        System.out.println(li.size());
//////        System.out.println("==============================");
//////
//////        for(String a: li){
//////            System.out.println(a);
//////        }
////
//////Bir ArrayList<Integer> yarat və içinə təsadüfi 10 rəqəm əlavə et.
//////
//////Bu rəqəmlərin cəmini hesablayan bir kod yaz.
//////
//////Siyahıdakı yalnız cüt rəqəmləri yeni bir Listə köçür və həmin yeni listi ekrana yazdır.
////
//////        ArrayList<Integer> numbers= new ArrayList<>();
//////        Random random= new Random();
//////        for(int i=0; i<10;i++){
//////            numbers.add(random.nextInt(101));
//////        }
//////        System.out.println("butun ededler: "+numbers);
////
////
//////        ArrayList<Integer> numbers= new ArrayList<>();
//////        Random random= new Random();
//////        for(int i=0; i<10;i++){
//////            numbers.add(random.nextInt(101));
//////        }
//////        System.out.println("butun ededler: "+numbers);
//////        System.out.println("======================================");
//////        List <Integer> numb= new ArrayList<>();
//////        for(Integer a: numbers){
//////            if(a%2==0){
//////                numb.add(a);
//////                System.out.println(a);
//////            }
//////        }
//////        System.out.println("--------------------------------");
//////        for(Integer b:numb){
//////            System.out.println(b);
//////        }
//////
//////        int sum=0;
//////        for(Integer c: numb){
//////            sum=sum+c;
//////        }
//////        System.out.println("sum is "+sum);
////
////
//////Class yarat: Product adında bir klassın olsun. Field-ləri: String name, double price.
//////
//////List yarat: ArrayList<Product> shopCart = new ArrayList<>();
//////
//////Məntiq: Səbətə 4-5 məhsul əlavə et (məsələn: "Telefon" - 800, "Qulaqlıq" - 50, "Mouse" - 20 və s.).
//////
//////Filtr: Qiyməti 100-dən baha olan məhsulların adını ekrana çıxar.
////
//////        List <Product> shopCart= new ArrayList<>();
//////        shopCart.add(new Product("Telefon",800));
//////        shopCart.add(new Product("qulaqliq",50));
//////        shopCart.add(new Product("mouse",20));
//////        System.out.println(shopCart.get(1));
//////        for(Product s:shopCart){
//////            if(s.getPrice()>100){
//////                System.out.println(s);
//////            }
//////        }
////
////
//////marka telefon claslari olur marka icerisinde telefon arrayi telefon icerisnde cixma ili yaddas falan yaza bilerik
////
////
//////normal generic class icinde bir field generic tip birde method ,fieldi methodun icerisinde qaytarin
///////parsint reqemleri stringden intecire ceviren istifadeci herf yazsa exceptionu tap ekrana yaz
////        //stringi integere cevirir bunuun ucun herf olmaz
////
////
////        // abstract ve generics bir classimiz olsun abstract T deyer qaytaran method olur
////        // bu clasdsdan extend eden alt classlar hemen T tipinden deyer qaytaran methodu overiide edib qaytardigi tipe esasen mini task yazir
////
////
//////        int [] arry={1,2,3,4,4};
//////        System.out.println("ededi daxil edin ");
//////        Scanner input= new Scanner(System.in);
//////        int a= input.nextInt();
//////        try{
//////            for (int b: arry){
//////                if(a==b){
//////                    System.out.println(" eded beraber ");
//////                }
//////                else {
//////                    System.out.println("uuuuuuuuuuuuuuuuuuuu");
//////                    System.out.println("pppppppppppppppppppp");
//////                    System.out.println("ssssssssssssssssssss");
//////                }
//////            }
//////        }catch (ArithmeticException n){0
//////
//////        }
////
////
//////boxing unboxing ,primitiv wrapper clasa boxing ,wrapperi primitive cevirmek unboxing
////
////
//////
//////        List<Integer> ededs= new ArrayList<>();
//////        ededs.add(1);
//////        ededs.add(2);
//////        ededs.add(3);
//////        ededs.add(4);
//////        List<Integer> numbs= new ArrayList<>();
//////        numbs.addAll(Arrays.asList(1,2,3,4,5,5,6,-1));
//////        for(Integer n: numbs){
//////            if(n%2==0){
//////                System.out.println("cut eded: "+n);
//////            }
//////            else {
//////                System.out.println("tek eded: "+n);
//////            }
//////        }
//////
//////        System.out.println("=======================");
//////        for(Integer d:ededs){
//////            if(d%2==0){
//////                System.out.println("cut eded "+d);
//////            }
//////            else {
//////                System.out.println("tek eded "+d);
//////            }
//////        }
////
////
//////        List<Integer> nums = new ArrayList<>(100);
//////
//////        int [] ary=new int[100];
//////        for(int i=1;i<100;i++){
//////            if(i%2==0){
//////                ary[i]=i;
//////                System.out.println(ary[i]);
//////            }
//////        }
////
////
//////
//////        List<Integer> numbs= new ArrayList<>();
//////        numbs.addAll(Arrays.asList(1,2,3,4,5,5,6,1));
//////        for(int i=0;i<numbs.size();i++){
//////            for(int j=i;j<numbs.size();j++) {
//////                if (numbs.get(i) == numbs.get(j)) {
//////                    numbs.remove(i);
//////
//////                }
//////            }
//////        }
//////        System.out.println(numbs);
////
//////
//////        List<Integer> numbs= new ArrayList<>();
//////        numbs.addAll(Arrays.asList(1,2,3,4,5,5,6,1));
//////        for(int i=0; i<numbs.size();i++){
//////            for(int j=0; j<numbs.size();j++){
//////                if(numbs.get(i)==numbs.get(j)){
//////                    numbs.remove(j);
//////                    System.out.println(numbs.get(j));
//////                }
//////            }
//////        }
////        // ArrayList<Integer> numbers= new ArrayList<>();
//////        Random random= new Random();
//////        for(int i=0; i<10;i++){
//////            numbers.add(random.nextInt(101));
//////        }
////
////
//////        int [] ary=new int[100];
//////        List<Integer> cut= new ArrayList<>();
//////        List<Integer> tek= new ArrayList<>();
//////        for(int i=0;i<100;i++){
//////            ary[i]=i;
//////        }
//////        for(int j=0; j<ary.length;j++){
//////            if(ary[j]%2==0){
//////                cut.add(ary[j]);
//////            }
//////            else {
//////                tek.add(ary[j]);
//////            }
//////
//////        }
//////        System.out.println(cut);
//////        System.out.println(tek);
////
//////        List<Integer> original = new ArrayList<>();
//////        List<Integer> tekrar = new ArrayList<>();
//////        original.add(1);
//////        original.add(2);
//////        original.add(1);
//////        original.add(1);
//////        original.add(3);
//////        for (int i = 0; i < original.size(); i++) {
//////            boolean okay = false;
//////            for (int j = 0; j < i; j++) {
//////                if (original.get(i) .equals( original.get(j))) {
//////                    okay = true;
//////                    break;
//////                }
//////            }
//////            if (!okay) {
//////                tekrar.add(original.get(i));
//////            }
//////        }
//////        System.out.println(original);
//////        System.out.println(tekrar);
////
////
//////
//////        List<Integer> original = new ArrayList<>();
//////        List<Integer> tekrar = new ArrayList<>();
//////        original.add(1);
//////        original.add(2);
//////        original.add(1);
//////        original.add(1);
//////        original.add(3);
//////        for (int i = 0; i < original.size(); i++) {
//////            boolean okay = false;
//////            for (int j = 0; j < i; j++) {
//////                if (original.get(i) .equals( original.get(j))) {
//////                    okay = true;
//////                    break;
//////                }
//////            }
//////            if (!okay) {
//////                tekrar.add(original.get(i));
//////            }
//////        }
//////        System.out.println(original);
//////        System.out.println(tekrar);
//////
//////        List<String> fruit= new ArrayList<>();
//////        fruit.add("alma");
//////        fruit.add("nar");
//////        fruit.add("banan");
//////        fruit.add("alma");
//////        System.out.println("sozu daxil edin");
//////        Scanner input= new Scanner(System.in);
//////        String soz= input.nextLine();
//////        int count =0;
//////        for(String a: fruit){
//////            if(a.equals(soz)){
//////                count++;
//////            }
//////        }
//////        System.out.println(count);
////
////
//////
//////        List<String> fruit= new ArrayList<>();
//////        fruit.add("nar");
//////        fruit.add("alma");
//////        fruit.add("banan");
//////        fruit.add("alma");
//////        System.out.println("sozu daxil edin");
//////        Scanner input= new Scanner(System.in);
//////        String soz= input.nextLine();
//////        int count =0;
//////        int index=0;
//////        for(String a: fruit){
//////            if(a.equals(soz)){
//////                index = fruit.indexOf(a);
//////                count++;
//////            }
//////        }
//////        System.out.println(count + " " + index);
////
//////
//////        Student nv=new Student("gunel","suleymanova",12);
//////        //System.out.println(nv);
//////        System.out.println(nv.getStudent());
//////        Student nb= new Student("amil","amilsa",122);
//////        System.out.println(nb.getStudent());
////
////
//////
//////        List<String> fruit= new ArrayList<>();
//////        fruit.add("nar");
//////        fruit.add("alma");
//////        fruit.add("banan");
//////        fruit.add("alma");
//////        fruit.set(1,"lll");
//////        System.out.println(fruit);
////
////
//////        int [] ary1=new int[1];
//////        System.out.println("ededi daxil edin");
//////        Scanner input=new Scanner(System.in);
//////        int count=0;
//////        int a=input.nextInt();
//////        count++;
//////        int[] ary2=new int[count];
//////        ary2[count-1]=a;
//////        ary1=null;
//////        System.out.println(ary2[count-1]);
//////        Scanner input1=new Scanner(System.in);
//////        int b=input1.nextInt();
//////        count++;
//////        int [] ary3=new int[count];
//////        for(int i=0;i<ary2.length;i++){
//////            ary3[i]=ary2[i];
//////        }
//////        ary3[ary3.length-1]=b;
//////        System.out.println(ary3[0]);
//////        ary2=null;
////
////       // Scanner input = new Scanner(System.in);
////        // boolean okay=true;
////
////
////      //  ArrayList<Integer> ns = new ArrayList<>();
////
////
//////Kodda: mehsul1.satici.ad Mənası: "Ey Java, get mehsul1-i tap, onun içindəki satici-yə bax və o satıcının ad-ını mənə gətir."
////
//////class student name age surname fieled obyektler yaradib arrayliste elave et .method yaz
////
////
//////        ssss new1=new ssss();
////////        new1.deyerdonduren();
//////        List <Integer> numbs= new ArrayList<>();
//////        numbs.add(1);
//////        numbs.add(2);
//////        numbs.add(3);
//////        numbs.add(4);
//////        numbs.add(5);
//////        System.out.println(numbs);
//////
//////
//////    }
////
////
////
////
//////        ssss new2=new ssss();
//////        ssss<Integer> new3= new ssss<>();
//////        new3.add(1);
//////
//////        Weekend <Integer> new1 = new Weekend<>();
//////        new1.add(1);
//////        new1.add(2);
//////        new1.add(9);
//////        new1.add(12);
//////        System.out.println(new1.size());
//////        new1.remove(1);
//////        System.out.println(new1.size());
//////        //new1.clear();
//////        System.out.println(new1.size());
//////        System.out.println(new1.contain(1));
////
//////        List<Integer> numb= new ArrayList<>();
//////        numb.add(1);
//////        numb.add(2);
//////        numb.add(3);
//////        numb.add(2);
//////        numb.add(4);
//////        numb.add(1);
//////        numb.add(5);
//////        List<Integer>numb1=new ArrayList<>();
//////        for(int i=0;i<numb.size();i++){
//////            boolean okay=false;
//////            for(int j=i+1;j<numb.size();j++){
//////
//////                if(numb.get(i)==numb.get(j)){
////////                numb1.add(numb.get(i));
//////                //System.out.println(numb1.get(i));
//////                okay = true;
//////                continue;
//////                   }
//////                else {
//////                    numb1.add(numb.get(j));
//////                    okay=false;
//////                }
//////                if(!okay)
//////                    break;
//////                }
//////        }
//////        System.out.println(numb1);
////
////
////
////
////
////
////
////
////
////
//////        List<Integer> numb= new ArrayList<>();
//////        numb.add(1);
//////        numb.add(2);
//////        numb.add(3);
//////        numb.add(2);
//////        numb.add(4);
//////        numb.add(1);
//////        numb.add(5);
//////        List<Integer>numb1=new ArrayList<>();
//////        for(int i=0;i<numb.size();i++){
//////            boolean okay=false;
//////            for(int j=0;j<numb1.size();j++){
//////                if(numb.get(i).equals(numb1.get(j))){
////////                if(numb.get(i)==numb1.get(j)){
//////                    okay=true;
//////                    break;
//////                }
//////            }
//////            if(!okay){
//////                numb1.add(numb.get(i));
//////            }
//////        }
//////        System.out.println(numb1);
////
////
////
//////
//////        List<Integer> numb= new ArrayList<>();
//////        numb.add(1);
//////        numb.add(2);
//////        numb.add(3);
//////        numb.add(2);
//////        numb.add(4);
//////        numb.add(1);
//////        numb.add(5);
//////        List<Integer> new2= new ArrayList<>();
//////        int max=numb.get(0);
//////        int maxsecond=numb.get(0);
//////        for (int i=0;i<numb.size();i++){
//////            if(numb.get(i)>max){
//////                max=numb.get(i);
//////            }
//////            if( numb.get(i)>maxsecond && numb.get(i)<max){
//////                System.out.println(numb.get(i));
//////                maxsecond=numb.get(i);
//////            }
//////
//////        }
//////        System.out.println(max);
//////        System.out.println(maxsecond);
////
////
////
////
////
////
////        List<Integer> numb= new ArrayList<>();
////        numb.add(1);
////        numb.add(2);
////        numb.add(3);
////        numb.add(2);
////        numb.add(4);
////        numb.add(1);
////        numb.add(5);
////        List<Integer> new2= new ArrayList<>(numb);
////        numb.sort(Comparator.naturalOrder());
////        System.out.println(numb);
////        LinkedList<String> new1= new LinkedList<>();
////        System.out.println(new1);
////        new1.add("1");
//
//
////        Student  new1= new Student("gunel","suleymanova",12);
//
//
////        LinkedList <String> new3= new LinkedList<>();
////        System.out.println(new3);
////        LinkedList<String> n = new LinkedList<>();
////        n.add("12");
////        n.add("1");
////        n.get(1);
////        System.out.println(n.get(0));
//
//
////        LinkedList<String> ll = new LinkedList<>();
//
////        List<Integer> new3= new ArrayList<>(new2);
////        System.out.println(numb);
////        System.out.println(new2);
////        System.out.println(new3);
//
//
////
////        Taskev new1= new Taskev();
////        System.out.println(new1.parrotTrouble(true,2));
//
//
////
////        List<Integer> numb= new ArrayList<>();
////        numb.add(1);
////        numb.add(2);
////        numb.add(3);
////        numb.add(2);
////        numb.add(4);
////        numb.add(1);
////        numb.add(5);
////        int sum=0;
////        int multi=1;
////        for(int a:numb){
////             sum+=a;
////             multi*=a;
////        }
////        System.out.println("multi "+multi+"  sum "+sum);
//
////        Scanner input= new Scanner(System.in);
////        List<Integer> numb= new ArrayList<>();
////        int sum=0;
////        int multi=1;
////        for(int i=0;i<5;i++){
////            System.out.println("ededi daxil edin");
////            numb.add(input.nextInt());
////            sum+=numb.get(i);
////            multi*=numb.get(i);
////
////        }
////        System.out.println(numb);
////        System.out.println("multi "+multi+" sum "+sum);
////
//
//
////        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 2);
////        List<Integer> checked = new ArrayList<>();
////        for(Integer s: list){
////            if(!checked.contains(s)){
////                int count =Collections.frequency(list,s);
////                System.out.println(s+" "+count);
////                checked.add(s);
////            }
////        }
//
//
////
////        Student gunel= new Student("gunekl","suleymanova",12);
////        Student arzu= new Student("arzu","suleymanova",13);
////        Student naz= new Student("naz","naza",23);
////        Student ibo= new Student("ibo","kjkjkjk",34);
////        Student vuso= new Student("vuse","ibon",23);
////        Student.getbyAge(20);
////        System.out.println(Student.getbyAge(20));
////        Student.deleteelement(1);
////        System.out.println(Student.getStudent());
//
////
////        ArrayList<Integer> array = new ArrayList<>();
////        array.add(44);
////        array.add(5);
////        array.add(-2);
////        array.add(10);
////        array.add(10);
////        array.add(6);
////        array.add(8);
////        ArrayList<Integer> array1= new ArrayList<>();
////        int count1 = 0;
////        int cte = array.get(0);
////        for (int i = 0; i < array.size(); i++) {
////            int count = 0;
////            for (int j = 0; j < array.size(); j++) {
////                if (array.get(i).equals(array.get(j))) {
////                    count++;
////
////                }
////                if (count1 < count) {
////                    count1 = count;
////                    cte = array.get(i);
////                    //System.out.println(array.get(i));
////
////                }
////            }
////        }
////        System.out.println(cte + " " + count1);
////
////    }
////}
//
//
////
////        ArrayList <String> new1= new ArrayList<>();
////        new1.add("aaaaa");
////        new1.add("bbb");
////        new1.add("ccccccc");
////        new1.add("dddd");
////        new1.add("eeeeeeeeeeeeeee");
////        for(int i=new1.size()-1;i>=0;i--){
////            if (new1.get(i).length()>5){
////                new1.remove(i);
////            }
////        }
////        System.out.println(new1);
////
//
//
////
////        List<Student> allStudents = new ArrayList<>();
////        List<Student> olderThan18 = new ArrayList<>();
////
////
////        Student nh= new Student("gunel","suleymanova",12);
////        nh.addLanguage("python");
////        nh.addLanguage("java");               //add to language!!!!!!!!!!!!
////
////        Student nm= new Student("Hagrid","bbbbbbbbb",19);
////        nm.addLanguage("c++");
////
////        Student Qaraca= new Student("qaraca","qaraca",33);
////
////        allStudents.add(nh);
////        allStudents.add(nm);
////
////        for (Student s : allStudents) {
////            if (s.getAge() > 18) {
////                olderThan18.add(s);
////            }
////        }
////        Student.Students(nm);
////        Student.Students(nh);
////        Student.Students(Qaraca);
//
//
//        //Student.Students(nh);                   //add to list  dont forgettttttttttts
//
//
////        Model model1= new Model("qqq",100,200,2025,Color.RED);
////        Model model2= new Model("www",20,21,2024,Color.BLUE);
////        Model model3= new Model("rrr",40,400,2040,Color.BLACK);
////        Model model4=new Model("ttt",120,122,1212,Color.RED);
////
////
////        Brand brand1= new Brand("samsung",List.of(model1,model2));
////        System.out.println(brand1);
//////        System.out.println(brand1.getModellist());
////        Brand brand2=new Brand("iphone",List.of(model3,model4));
////        //System.out.println(brand2.getModellist());
////        System.out.println(brand2);
//
//
////        Set<String> adlar = new HashSet<>();
////        adlar.add("Ali");
////        adlar.add("Veli");
////        adlar.add("Ali");
////
////        System.out.println(adlar.size());
////        System.out.println(adlar);
////
////        PriorityQueue<Integer> nobe = new PriorityQueue<>();
////        nobe.add(50);
////        nobe.add(10);
////        nobe.add(30);
////
////        System.out.println(nobe.poll()); // poll() növbənin başındakı elementi çıxarır
//
//
////        ArrayList<String> sozler= new ArrayList<>();
////        sozler.add("soz");
////        sozler.add("soz");
////        sozler.add("ss");
////        sozler.add("dd");
//////        HashSet<String> sozler1=new HashSet<>(sozler);
//////        System.out.println(sozler1);
////        LinkedHashSet<String>sozler3= new LinkedHashSet<>(sozler);
////        System.out.println(sozler3);
//
//
////        List<Integer> numbers= new ArrayList<>();
////        numbers.add(5);
////        numbers.add(2);
////        numbers.add(8);
////        numbers.add(2);
////        numbers.add(5);
////        numbers.add(1);
////        numbers.add(9);
////        numbers.add(8);
////        System.out.println(numbers);
////        TreeSet<Integer>number3= new TreeSet<>(numbers);
////        System.out.println(number3);
//
//
////
////        List<Integer> numbers= new ArrayList<>();
////        numbers.add(10);
////        numbers.add(1);
////        numbers.add(5);
////        numbers.add(3);
////        System.out.println(numbers);
////       PriorityQueue<Integer>number1=new PriorityQueue<>(numbers);
////        System.out.println(number1);
////        System.out.println(number1.poll());
////        System.out.println(number1);
//
//
////
////        List<String> students = new ArrayList<>();
////        students.add("Ali");
////        students.add("Leyla");
////        students.add("Ali");
////
////        HashSet<String> uniqueStudents = new HashSet<>(students);
//
//// Sual: İndi mən uniqueStudents-dən "Leyla"nı tapmaq üçün
//// uniqueStudents.get(1) yaza bilərəmmi?
//
////        List<Dishes> dishes = new ArrayList<>();
////        String[] ingforp = {"un", "pomidor", "biber","vs....."};
////
////        Dishes pizza = new Dishes("pizza", 6, ingforp);
////        Dishes spageti = new Dishes("spagetti", 23, ingforp);
////        Dishes free = new Dishes("free", 9, ingforp);
////        Dishes burger = new Dishes("burger", 4, ingforp);
////
////        dishes.add(burger);
////        dishes.add(pizza);
////        dishes.add(free);
////        dishes.add(spageti);
////
////        Menu menu=new Menu(dishes);
////        System.out.println(menu);
//
//
////
////        Queue<Integer>numbers=new LinkedList<>();
////        numbers.add(10);
////        numbers.add(20);
////        numbers.add(30);
////        System.out.println(numbers);
////        numbers.poll();
////        System.out.println(numbers);
////        System.out.println(numbers.peek());
//
//        // Queue<Integer> numbers=new LinkedList<>();
////
////        Task2 new1=new Task2();
////        new1.numbers.add(2);
////        new1.numbers.add(3);
////        new1.numbers.add(1);
////        new1.numbers.add(6);
////        new1.numbers.add(9);
////        System.out.println(new1.numbers);
////        int a= new1.numbers.size();
////        System.out.println(a);
////        while (true){
////            if(a>0) {
////                new1.numbers.poll();
////                a--;
////            }else{
////                System.out.println("bosss");
////                break;
////
////            }
////            }
////        }
////Task3 new33=new Task3("huhu");
//
//
////ayyaylist ilk son elementini cixar ,son elementini sil
//
////
////        new Task3("Muşteri1");
////        new Task3("Muşteri2");
////        new Task3("Muşteri3");
////
////        System.out.println();
////
////        Musteri new1= new Musteri("gull");
////        Musteri.poli();
////
////    }
////}
//
////
////        Queue<String> queue = new LinkedList<>();
////
////        queue.add("Elma");
////        queue.add("Armut");
////        queue.add("Muz");
////
////        while (!queue.isEmpty()) {
////            String removedElement = queue.poll(); // Elementi çıkarır ve döndürür
////            System.out.println(removedElement + " silindi.");
////        }
////
////        // Queue tamamen boşsa mesaj yazdır
////        if (queue.isEmpty()) {
////            System.out.println("Queue boşdur.");
////        }
//
//
////    public static void add1(int a) {
////        numbers.add(a);
////
////    }
//
//
////
////        ArrayList<Integer> array = new ArrayList<>();
////        array.add(44);
////        array.add(5);
////        array.add(-2);
////        array.add(10);
////        array.add(10);
////        array.add(6);
////        array.add(8);
////
////        ArrayList<Integer> array1 = new ArrayList<>();
////
////        for (int i = 0; i < array.size(); i++) {
////            boolean okay = false;
////            for (int j = 0; j < array1.size(); j++) {
////                if (array.get(i).equals(array1.get(j))) {
////                    okay = true;
////                    continue;
////                }
////            }
////
////            if (!okay) {
////                array1.add(array.get(i));
////            }
////        }
////
////        System.out.println(array1);
////    }}
//
//
////
////
////
////
////        }
//
//
////        List<String> new1 = new ArrayList<>();
////        List<String> new2 = new ArrayList<>();
////        new1.add("a");
////        new1.add("b");
////        new1.add("c");
////        new2.add("d");
////        new2.add("e");
////        new2.add("f");
////        System.out.println(new1);
////        System.out.println(new2);
////        new1.addAll(new2);
////        System.out.println(new1);
////        System.out.println(new1.get(5));
//
//
////        Weekend<Integer> new1 = new Weekend<>();
////        new1.add(1);
////        new1.add(2);
////        System.out.println(new1.size());
////
//
//
////        System.out.println(new1);
//////        new1.index(-9);
////        new1.size();
////        System.out.println(new1.size());
////        new1.remove(1);
////        System.out.println(new1.size());
//
//
////        new2.add(9);
////        new2.add(3);
////        new2.add(4);
////        new2.add(11);
////        new2.ekranayazdir();
//
//        // System.out.println(new2);
//
//
////
////            static int binarySearch(int a[], int l, int r, int x){
////
////                while (l <= r){
////
////                    int m = (l + r) / 2;
////
////                    // Index of Element Returned
////                    if (a[m] == x) {
////                        return m;
////
////                    }
////                    else if (a[m] > x) {
////                        r = m - 1;
////
////                    }
////                    else {
////                        l = m + 1;
////                    }
////                }
////
////                return -1;
////            }
////
////            public static void main(String args[])
////            {
////
////                int a[] = { 2, 3, 4, 10, 40 };
////                int n = a.length;
////                int x = 10;
////
////                int res = binarySearch(a, 0, n - 1, x);
////
////                System.out.println("Element to be searched is : "
////                        + x);
////
////                if (res == -1)
////                    System.out.println(
////                            "Element is not present in array");
////                else
////                    System.out.println(
////                            "Element is present at index: " + res);
////            }
////        }
//
//
////        int [] ary = {1,2,3,4,5,6,7};
////        int target=3;
////        int left=0;
////        int right=ary.length-1;
////        while (left<=right) {
////            int mid = left + (right - left);
////            if (ary[mid] == target) {
////                System.out.println(mid);
////
////            }
//
//
////        Queue<String> musteri = new LinkedList<>();
////
////        musteri.add("Musteri1");
////        musteri.add("Musteri2");
////        musteri.add("Musteri3");
////
////        while (!musteri.isEmpty()) {
////            String x = musteri.poll();
////            System.out.println(x + "-in emeliyyati tamamlandi");
////        }
////
////
////    }}
//
////list olsun 2 dene bunlari bir sete yazaq kesisen elementleri ortaq elementleri bir liste
////
////        Set<Integer>num1= new HashSet<>();
////        Set<Integer>num2= new HashSet<>();
////        num1.add(1);
////        num1.add(2);
////        num1.add(3);
////        num1.add(4);
////
////        num2.add(5);
////        num2.add(2);
////        num2.add(6);
////        num2.add(3);
////        Set<Integer>numk=new HashSet<>();
////        Set<Integer>numb=new HashSet<>();
////
////        for(Integer f: num1){
////            for(Integer s: num2){
////                if(s.equals(f)){
////                    numb.add(f);
////                }
////            }
////        }
////        numk.addAll(num1);
////        numk.addAll(num2);
////        Set <Integer> numl= new HashSet<>();
////
////        System.out.println(numk);
////        System.out.println(numb);
////        for(Integer s: numk){
////            if(!numb.contains(s)){
////                numl.add(s);
////            }
////        }
////
////        System.out.println(numl);
//
////
////        LinkedList<Integer>num1= new LinkedList<>();
////        List<Integer>num2=new ArrayList<>();
////        num1.add(1);
////        num1.add(2);
////        num1.add(3);
////        num1.add(4);
////        num1.add(5);
////        System.out.println(num1);
////        num1.add(3,8);
////        System.out.println(num1);
////        num1.remove(0);
////        System.out.println(num1);
////        num1.remove(3);
////        System.out.println(num1);
////        num1.add(4,9);
////        System.out.println(num1.get(6));
//
//
////Stack<Integer>number1=new Stack<>();
////number1.add(1);
////number1.add(2);
////number1.add(3);
////number1.add(4);
////number1.add(5);
////        System.out.println(number1);
////        number1.get(4);
////        System.out.println(number1.get(3));
////        number1.push(2);
////        number1.add(1,8);
////        System.out.println(number1);
////        Stack<String>soz= new Stack<>();
////        soz.add("java");
////        soz.reversed();
////        System.out.println(soz);
////        System.out.println(soz.reversed());
////
////        String input="Salam";
////        Stack<Character>soz1= new Stack<>();
////        for(char c: input.toCharArray()){
////            soz1.push(c);
////        }
////
////        StringBuilder reversed= new StringBuilder();
////        while (!soz1.isEmpty()){
////            reversed.append(soz1.pop());
////        }
////
////        System.out.println(reversed.toString());
////        System.out.println(soz1);
//
////Stack<Integer>mn=new Stack<>();
////mn.push(5);
////mn.push(2);
////mn.push(3);
////mn.push(4);
////mn.pop();
////        System.out.println(mn);
//
//
////        List<Integer>nums= new ArrayList<>();
////        for(int i=0 ; i<=1000;i++){
////            nums.add(i);
////        }
////        System.out.println(nums);
////        nums.get(547);
////        System.out.println(nums.get(547));
//
//
////        List<String>new1= new LinkedList<>();
////        new1.add("bir");
////        new1.add("iki");
////        new1.addFirst("11");
////        new1.addLast("son");
////        System.out.println(new1);
//
//
////        Stack<String>soz=new Stack<>();
////        soz.push("salam");
////        soz.push("necesen ");
////        soz.push("sagol");
////        System.out.println(soz);
////        soz.pop();
////        System.out.println(soz);
//
//
////
////                Vector<String> emeliyyatlar = new Vector<>();
////                emeliyyatlar.add("ATM: 50 AZN çıxarıldı");
////                emeliyyatlar.add("Online: 20 AZN ödənildi");
////                System.out.println("Siyahı: " + emeliyyatlar);
////            }
//
//
////
////                Stack<String> tarixce = new Stack<>();
////                tarixce.push("Birinci cümlə.");
////                tarixce.push("İkinci cümlə.");
////                tarixce.push("Səhv yazılan cümlə.");
////                tarixce.pop();
////
////                System.out.println("Siyahıda qalanlar: " + tarixce);
//
//
////        HashSet<String> adlar = new HashSet<>();
////
////        adlar.add("Ali");
////        adlar.add("Leyla");
////        adlar.add("Ali"); // Eyni adı yenidən əlavə etməyə çalışırıq
////
////        System.out.println(adlar);
////
////
////
////
////
////
////        TreeSet<Integer> reqemler = new TreeSet<>();
////
////        reqemler.add(50);
////        reqemler.add(10);
////        reqemler.add(30);
////        reqemler.add(10); // Yenə təkrar element!
////
////        System.out.println(reqemler);
//
//
////        HashMap<String, Integer> map = new HashMap<>();
////
////        map.put("alma", 3);
////        map.put("armud", 5);
////
////        System.out.println(map.get("alma")); // 3
////        System.out.println(map.containsKey("armud")); // true
////
////        map.remove("alma");
////        System.out.println(map);
//
//
////
////        HashMap<Integer, String> map = new HashMap<>();
////
////        map.put(1, "Ali");
////        map.put(2, "Veli");
////        map.put(3, "Aysel");
////        System.out.println(map);
//
//
////        List<Integer>list1=new ArrayList<>();
////        list1.add(10);
////        list1.add(20);
////        list1.add(30);
////        list1.add(40);
////        System.out.println(list1);
////        list1.remove(2);
////        System.out.println(list1);
////        System.out.println("olcu "+list1.size());
//
//
////
////        List<String>list1=new ArrayList<>();
////        list1.add("Ali");
////        list1.add("Veli");
////        list1.add("Aysel");
////        list1.add("Ali");
////        int saya=0;
////        for(int j=0;j<list1.size();j++){
////            boolean okay=true;
////            for(int i=0;i<j;i++){
////                if(list1.get(i).equals(list1.get(j))){
////                    okay=false;
////                    break;
////                }
////            }
////                if(okay){
////                    int say=0;
////                    for(String s: list1){
////                        if(list1.get(j).equals(s)){
////                            say++;
////                        }
////                }
////            saya++;
////            System.out.println( list1.get(j)+ say);
////        }
////
////            }
//
////        List<Integer>list1=new ArrayList<>();
////        list1.add(10);
////        list1.add(20);
////        list1.add(30);
////        list1.add(40);
////        System.out.println(list1);
////        list1.remove(1);
////        System.out.println(list1);
////        int a=list1.size();
////        System.out.println(a);
//
//
////        List<String>list1= new ArrayList<>();
////        list1.add("Ali");
////        list1.add("Veli");
////        list1.add("Aysel");
////        list1.add("Ali");
////        System.out.println(list1.get(0));
////        System.out.println(list1.get(list1.size()-1));
////        int count =0;
////        for(String d:list1){
////            if(d.equals(list1.get(0))){
////                count++;
////            }
////        }
////        System.out.println(count);
//
//
////        Scanner input= new Scanner(System.in);
////        List<Integer>list1= new ArrayList<>();
////        List<Integer>list2=new ArrayList<>();
////        for(int i=0;i<5;i++){
////            System.out.println("ededi daxil edin");
////            int a=input.nextInt();
////            if(a%2==0){
////                list1.add(a);
////            }
////            else if(a%2!=0){
////                list2.add(a);
////            }
////
////        }
////        System.out.println("cutler "+list1);
////        System.out.println("tekler "+list2);
//
//
////
////        Set<Integer>list1= new HashSet<>();
////        list1.add(1);
////        list1.add(2);
////        list1.add(3);
////        list1.add(3);
////        list1.add(4);
////        list1.add(4);
////        list1.add(5);
////        System.out.println(list1);
//
//
////
////        List<String>list1= new ArrayList<>();
////        list1.add("Ali");
////        list1.add("Aysel");
////        list1.add("Veli");
////        list1.add("Ali");
////        list1.add("Gunay");
////        list1.add("Gulnar");
////        System.out.println(list1);
////        Set<String>list2=new HashSet<>(list1);
////        System.out.println(list2);
//
//
////        Set<Integer>list1= new TreeSet<>();
////        list1.add(2);
////        list1.add(1);
////        list1.add(11);
////        list1.add(3);
////        list1.add(8);
////        list1.add(56);
////        list1.add(2);
////        list1.add(23);
////        list1.add(15);
////        list1.add(32);
////        System.out.println(list1);
////        int max =0;
////        for(Integer s: list1){
////            if(s>max){
////                max=s;
////            }
////        }
////        int min=max;
////        System.out.println(max);
////        for(Integer d:list1){
////            if(d<min){
////                min=d;
////            }
////        }
////        System.out.println(min);
//
//
////
////        Queue<String>list1=new LinkedList<>();
////        list1.add("task1");
////        list1.add("task2");
////        list1.add("task3");
////        list1.add("task4");
////        System.out.println(list1);
////        System.out.println(list1.poll());
////        System.out.println(list1);
//
//
////
////        Queue<Integer>list1= new LinkedList<>();
////        list1.add(5);
////        list1.add(10);
////        list1.add(15);
////        System.out.println(list1);
////        System.out.println(list1.poll());
////        System.out.println(list1.poll());
////        System.out.println(list1);
//
//
////        Queue<String>list1=new LinkedList<>();
////        list1.add("bir");
////        list1.add("iki");
////        list1.add("uc");
////        list1.add("dord");
////        System.out.println(list1);
////        list1.poll();
////        list1.poll();
////        System.out.println(list1);
//
//
////        List<Integer>list1=new ArrayList<>();
////        list1.add(1);
////        list1.add(2);
////        list1.add(2);
////        list1.add(3);
////        list1.add(4);
////        list1.add(4);
////        list1.add(5);
////        System.out.println(list1);
////        Set<Integer>list2=new TreeSet<>(list1);
////        System.out.println(list2);
////        Queue<Integer>list3=new LinkedList<>(list2);
////        System.out.println(list3);
////        list3.poll();
////        System.out.println(list3);
//
////
////        Scanner input= new Scanner(System.in);
////        Set<Integer>list1=new TreeSet<>();
////        for(int i=0;i<10;i++){
////            int a=input.nextInt();
////            if(a>0){
////                list1.add(a);
////            }
////
////        }
////        System.out.println(list1);
//
//
////        List<Integer>list1=new ArrayList<>();
////        list1.add(1);
////        list1.add(2);
////        list1.add(2);
////        list1.add(3);
////        list1.add(4);
////        list1.add(4);
////        list1.add(5);
////        System.out.println(list1);
////        List<Integer>list2= new ArrayList<>();
////        for(int i=list1.size()-1;i>=0;i--){
////            list2.add(list1.get(i));
////        }
////        System.out.println(list2);
//
//
////
////        Set<Integer>list1= new HashSet<>();
////        list1.add(1);
////        list1.add(2);
////        list1.add(3);
////        list1.add(4);
////        list1.add(5);
////        Set<Integer>list2=new HashSet<>();
////        list2.add(4);
////        list2.add(5);
////        list2.add(6);
////        list2.add(7);
////        list2.add(8);
////        Set<Integer>list3=new HashSet<>(list1);
////        list3.addAll(list2);
////
////        System.out.println(list3);
////
////          Set<Integer>list4=new HashSet<>();
////         list4.addAll(list3);
////         for(Integer s: list2){
////             if(list1.contains(s)){
////                 list4.remove(s);
////             }
////         }
////        System.out.println(list4);
////
////         Set<Integer>list5=new HashSet<>();
////         for(Integer s: list1){
////             if(list2.contains(s)){
////                 list5.add(s);
////             }
////         }
////
////        System.out.println(list5);
//
//
////
////        Queue <Customer> customers=new LinkedList<>();
////
////        Customer bir= new Customer("gunel");
////        Customer iki=new Customer("fatima");
////        Customer uc=new Customer("murad");
////        Customer dord=new Customer("farid");
////        Customer bes=new Customer("eldeniz");
////
////        customers.add(bir);
////        customers.add(iki);
////        customers.add(uc);
////        customers.add(dord);
////        customers.add(bes);
////        System.out.println(customers);
////
////
////
////        int totalTime = 0;
////
////        while (!customers.isEmpty()) {
////            Customer current = customers.poll(); // növbədən çıxarır
////            System.out.println("Xidmət olunur: " + current);
////            totalTime += current.getOpTime();
////        }
////
////        System.out.println("Ümumi xidmət vaxtı: " + totalTime + " saniyə");
//
//
////
////        Scanner input= new Scanner(System.in);
////        Set<Integer>list1=new TreeSet<>();
////        for(int i=0;i<10;i++){
////            System.out.println("ededi daxil edin");
////            int a=input.nextInt();
////            if(a>5){
////                list1.add(a);
////            }
////
////        }
////        System.out.println(list1);
////        List<Integer>list2=new ArrayList<>(list1);
//        //    System.out.println(list2);
//
//
////        List<String> names = new ArrayList<>();
////        names.add("Ali");
////        names.add("Veli");
////        names.add("Aysel");
////        names.add("Gunay");
////
////        List<String>list1= new ArrayList<>();
//        //  for()
//
//
////        File file= new File("test.txt");
////        file.createNewFile();
////        if(file.exists()){
////            System.out.println("dosya var");
////        }
////        else{
////            System.out.println("dosya yoxdur");
////        }
//
////        File folder= new File("klasor");
////        folder.mkdir();
//
//
////
////
////
////        import java.io.File;
////import java.io.FileWriter;
////import java.io.IOException;
////import java.time.LocalDateTime;
////import java.util.Scanner;
//
//
////                log("INFO", "Program basladi");
////
////                String username = "ali";
////                String password = "1234";
////
////                // Sadə login yoxlaması
////                if (login(username, password)) {
////                    log("INFO", "Login ugurlu | user=" + username);
////                    System.out.println("Xos geldin " + username);
////                } else {
////                    log("WARNING", "Login ugursuz | user=" + username);
////                    System.out.println("Yanlis istifadeci adi ve ya sifre");
////                }
////
////                log("INFO", "Program bitdi");
////            }
////
////            // LOGIN metodu
////            static boolean login(String user, String pass) {
////                return user.equals("ali") && pass.equals("1234");
////            }
////
////            // LOG yazan metod
////            static void log(String level, String message) {
////                try {
////                    File file = new File("log.txt");
////
////                    FileWriter writer = new FileWriter(file, true); // append = true
////                    String time = LocalDateTime.now().toString();
////
////                    writer.write(time + " [" + level + "] " + message + "\n");
////                    writer.close();
////
////                } catch (IOException e) {
//        //                  System.out.println("Log yazila bilmedi!");
////                }
////            }
////        }
//
//
////
////
////        Customer customer = new Customer("Ali", 500.0, LocalDate.of(2026, 1, 4));
////        checkCredit(customer);
////    }
////
////    static void checkCredit(Customer customer) {
////        LocalDate today = LocalDate.now();
////
////        if (today.isEqual(customer.nextCreditDate)) {
////            System.out.println("Salam " + customer.name + "! Bu gün kreditinizi ödəməlisiniz. 💰");
////        }
//
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("parolu daxil edin: ");
////        String a=input.nextLine();
////        char[] charArray = a.toCharArray();
////        int bal=0;
////        if(a.length()>=8){
////            bal++;
////        }
////        boolean okay= false ;
////            for(char s: charArray){
////                if(Character.isUpperCase(s)){
////                okay= true;
////            }}
////            if(okay) {
////                bal++;
////            }
////
////        boolean oka= false ;
////        for(char s: charArray){
////            if(Character.isLowerCase(s)){
////                oka= true;
////            }}
////        if(oka) {
////            bal++;
////        }
////
////        boolean oki= false;
////        for(char s: charArray){
////            if(Character.isLetterOrDigit(s)){
////                oka=true;
////            }
////        }
////        if(oka){
////            bal ++;
////        }
////
////
////          if (bal>3){
////              System.out.println("guclu parol");
////        }
////          else if (bal>2){
////              System.out.println("orta parol");
////          }
////          else {
////              System.out.println("zeif parol");
////          }
////
////        }}
//
////taskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
////        Student s1= new Student("gunel",100);
////        Student s2=new Student("marry",200);
////        Student s3=new Student("mike",300);
////        Student s4=new Student("judi",400);
////
////        All mngr1=new All();
////        mngr1.addStudent(s1);
////        mngr1.addStudent(s2);
////        mngr1.addStudent(s3);
////        mngr1.addStudent(s4);
////        System.out.println(mngr1);
////
////        System.out.println(mngr1.averageScore());
////        System.out.println(mngr1.max());
////        mngr1.tappp(500);
////
////        System.out.println("=================");
////        mngr1.scorereturn("gunel");
////        //System.out.println(db1.tappp(50));
//
//
////taskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
//
//
////        Map<String, Integer> list1 = new HashMap<>();
////        list1.put("gunel", 100);
////        list1.put("stella", 90);
////        list1.put("murad", 40);
////        list1.put("ferryy", 99);
////        System.out.println(list1);
//////ortalamaaaa
////        int sum = 0;
////        for (Integer s : list1.values()) {
////            sum += s;
////        }
////        double netice = (sum) / list1.size();
////        System.out.println("bal ortalamasi "+netice);
////
//////en yuksek
////        int max = 0;
////        for (Integer s : list1.values()) {
////            if (s > max) {
////                max = s;
////            }
////        }
////        System.out.println("max bal "+max);
////        //50 den asagi bal olan telebe
////
////        for(Integer s: list1.values()){
////            if(s<50){
////                System.out.println("50 den asagi "+s);
////            }
////        }
//////Verilmiş ada görə (String name) balı tap (əgər yoxdursa mesaj göstər)
////
////        System.out.println(list1.get("gunel"));
//
//
//
//
//
//
//
//
//
//
////
////        int [][] a={{1,2,3,4},{9,8,7,6}};
////        for(int i=0;i<a.length;i++){
////            for(int j=0;j<a[i].length;j++){
////                System.out.print(a[i][j]+" ");
////            }
////        }
//
//
////
////        int [][][] array={
////
////                {
////
////                          {1,2,3,4,},{5,6,7,8},{9,10,11,12}
////                },
////
////                {
////                         {13,14,15,16},{17,18,19,20}
////                },
////
////                {
////                         {21, 22, 23, 24, 25}
////                }
////
////        };
////
////
////        System.out.println(array[2][0][3]);
////
//
////
////        for(int i=0;i< array.length;i++){
////            for(int j=0;j<array[i].length;j++){
////                for(int s=0;s<array[j].length;s++){
////                    System.out.println(array[2][0][]);
////                }
////            }
//
// //       }
//
//
//
//
////
////        for(int i=0;i< array.length;i++){
////            for(int j=0;j<array[i].length;j++){
////                for(int s=0;s<array[j].length;s++){
////                    System.out.println(array[i][j][s]);
////                }
////            }
////
////        }
//
//
//
//
//
////
////        Map<String , Map<String, Integer>> orders= new HashMap<>();
////        orders.put("samir",Map.of("telefon",1));
////        orders.put("gunel",Map.of("qelem",2));
////        orders.put("farid",Map.of("adaptor",4,"bayraq",1,"sac",2));
////        orders.put("gunay",Map.of("lovhe",1,"hdmi cabel",2));
////        System.out.println(orders);
////        System.out.println(orders);
////        for(var entry: orders.entrySet()){
////            for(var product : entry.getValue().entrySet()){
////
////                System.out.println(entry.getKey() +" "+ product.getKey() +" "+ product.getValue());
////            }
////        }
////
////
////
////
////        int say=0;
////        int cem=0;
////        for(var entry: orders.entrySet()){
////            for(var product : entry.getValue().entrySet()){
////
////                System.out.println(entry.getKey() +" "+ product.getKey() +" "+ product.getValue());
////                cem+= product.getValue();
////                say++;
////            }
////        }
////        System.out.println("mehsul sayi: "+cem);
////        System.out.println(say);
////        System.out.println(cem/say);
////        int say=0;
////        int cem=0;
////        int max = 0 ;
////        String name = "";
////        for(var entry: orders.entrySet()){
////            for(var product : entry.getValue().entrySet()){
////                System.out.println(entry.getKey() +" "+ product.getKey() +" "+ product.getValue());
////                cem+= product.getValue();
////                say++;
////
////                if(max<product.getValue()){
////                    max= product.getValue();
////                    name=entry.getKey();
////                }
////
////            }
////        }
////
////        System.out.println("=======================================");
////        System.out.println("mehsul sayi: "+cem);
////        System.out.println("mehsul sayi "+say);
////        System.out.println("ortalama say "+(cem/say));
////        System.out.println("en cox mehsul "+name);
////
////
////        List<String> azliq = new ArrayList<>();
////
////        for (var entry : orders.entrySet()) {
////            if (entry.getValue().size() == 1) {
////                azliq.add(entry.getKey());
////            }
////        }
////
////        for (String ad : azliq) {
////            orders.remove(ad);
////        }
////
////        System.out.println(orders);
//
//
////        System.out.println("================================== ");
////        Calculator c= (a,b)->a+b;
////        System.out.println(c.calc(3,9));
//
//
////        Function<Integer,Boolean> function=(a)-> (a*20/100>0);
////        System.out.println(function.apply(20));
//
////        Function<List<Integer>,Boolean> function= (a) -> (a.contains(18));
////        Function <List<Integer>,Integer>function1=(a)-> (a.getLast());
//
//
////        var humans= List.of(
////             new Human("gunel",10),
////             new Human("ayan",12),
////             new Human("amil",13),
////             new Human("humay",34)
////        );
////
////
////var x= humans.stream().filter(h->h.getAge()>18).toString();
////        System.out.println(x);
//
//
//////////////////////////////////////////////////////
//
//
//
//    }
//
//
//
////        public static String exampleOfSwitch(WeekDays weekDays){
////    String result = null;
////            Integer WeekDays = null;
////            switch (WeekDays){
////        case SUNDAY:
////        result= "bu gun yaxsidir ";
////        break;
////        case FRIDAY :
////            result= "bu gun fridaydir ";
////
////
////    }
////    return result;
////        }
//
////
////        Scanner input= new Scanner(System.in);
////        int a=input.nextInt();
////        String dayname = "";
////        switch (a){
////
////            case 1:
////                 dayname= "Monday";
////                 break;
////            case 2:
////                dayname = "Tuesday";
////                break;
////            case 3:
////                dayname = "Wednesday";
////                break;
////            case 4:
////                dayname = "Thursday";
////                break;
////            case 5:
////                dayname = "Friday";
////                break;
////            case 6:
////                dayname = "Saturday";
////                break;
////            case 7:
////                dayname = "Sunday";
////                break;
//
//        }
//
//
//
//
//
//
//        //System.out.println(dayname);
//
//
/////////////////////////////////////////////////////////////
////        Scanner input1= new Scanner(System.in);
////        System.out.println("simvolu daxil edin: ");
////        String aa= input1.nextLine();
////        int b=input1.nextInt();
////        int c= input1.nextInt();
////        double cavab=0;
////        switch (aa){
////            case "+":
////                cavab=c+b;
////                break;
////            case "-":
////                cavab=c-b;
////                break;
////            case "/":
////                cavab=c/b;
////                break;
////            case "*":
////                cavab=c*b;
////                break;
////
////        }
////        System.out.println(cavab);
//
//
//
//
//
//
//
//
//        //     for(Map.Entry<String,Student> entry : stdnt.entrySet()){
////            System.out.println(entry.getKey()+" : "+ entry.getValue());
////            entry.getValue()+
////        }
////        return
//
//
////
////        Scanner input = new Scanner(System.in);
////        Set<Integer> list = new HashSet<>();
////        while (true) {
////            System.out.println("ededi daxil et: ");
////            int a = input.nextInt();
////            if (list.contains(a)) {
////                System.out.println("eyni ededdir ");
////            }
////            if (a == -1) {
////                break;
////            }
////            list.add(a);
////        }
////        System.out.println(list);
//
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("texti daxil edin ");
////        String soz =input.nextLine();
////        char [] chars= soz.toCharArray();
////for(int i=0; i<chars.length;i++) {
////    if (Character.isUpperCase(chars[i])) {
////        chars[i] = Character.toLowerCase(chars[i]);
////    }
////       if (Character.isLowerCase(chars[i])) {
////        chars[i] = Character.toUpperCase(chars[i]);
////    }
////}
////
////        String result = new String(chars);
////        System.out.println( result);
//        //   }
//
//
//    //}
//
//
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("texti daxil edin ");
////        String soz =input.nextLine();
////        char [] chars= soz.toCharArray();
////        for(int i=0;i<soz.length();i++){
////            if(Character.isUpperCase(soz.));
////        }
//
//
////
////                int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
////                int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
////
////                int source_arr[], sourcePos, dest_arr[], destPos, len;
////                source_arr = s;
////                sourcePos = 3;
////                dest_arr = d;
////                destPos = 5;
////                len = 4;
////
////                // Print elements of source
////                System.out.print("source_array : ");
////                for (int i = 0; i < s.length; i++)
////                    System.out.print(s[i] + " ");
////                System.out.println("");
////
////                System.out.println("sourcePos : " + sourcePos);
////
////                // Print elements of source
////                System.out.print("dest_array : ");
////                for (int i = 0; i < d.length; i++)
////                    System.out.print(d[i] + " ");
////                System.out.println("");
////
////                System.out.println("destPos : " + destPos);
////
////                System.out.println("len : " + len);
////
////                // Use of arraycopy() method
////                System.arraycopy(source_arr, sourcePos, dest_arr,
////                        destPos, len);
////
////                // Print elements of destination after
////                System.out.print("final dest_array : ");
////                for (int i = 0; i < d.length; i++)
////                    System.out.print(d[i] + " ");
////            }
////        }
////bu taskdir  evde etmelisen biinary search arasdir
//
//
////1 den 100 cut ededleri versin
//
//int sayB=0;
//       for(int i=0;i<b.length;i++){
//           sayB++;
//       }
//       int sayC=sayA+sayB;
//       int bb=a.length+b.length;
//       System.out.println(bb);
//

//











       
//       int a[] = {1, 2, 3, 4};
//       int b[] = {3, 4, 5, 6};
//       int say = a.length + b.length;
//       int c[] = new int[say];
//       int index = 0;
//       for (int i = 0; i < a.length; i++) {
//           c[i] = a[i];
//           index++;
//       }
//       for (int i = 0; i < b.length; i++) {
//           c[index] = b[i];
//           index++;
//       }
//
//       for (Integer s : c) {
//           System.out.println(s);
//       }
//////////////////////////////////////////////////ikisini bir araya getirdim

//
//       int f[] = new int[c.length];
//       boolean okay = false;
//       for (int i = 0; i < c.length; i++) {
//           okay = false;
//           for (int j = i + 1; j < c.length; j++) {
//               if (c[i] == c[j]) {
//                   okay = true;
//                   break;
//               }
//           }
//           if (!okay) {
//               f[i] = c[i];
//           }
//       }
//       System.out.println("====================================");
//
//       for (int i = 0; i < f.length; i++) {
//           System.out.println(f[i] + " bu");
//       }


/// /////////////////////////////////////////////tekrarlari aradan qaldirdim




//list yaradin icerisinde 1-100 qeder eded elave edin Stream ile listin icindeki 10 dan boyuk ve cut ededleri cap edin
//
//       System.out.println("=====================================================");
//
//       List<Integer>list1= new ArrayList<>();
//       for(int i=0;i<=100;i++){
//           list1.add(i);
//       }
//
//       System.out.println(list1.stream().filter(n -> n>=10 && n % 2 == 0).toList());





       //Function interfaceyi custom yazin
       //Text alb textin uzunlugunu capa verin

//       String biri="snenenen";
//       CusstomFunction bir=text -> text.length();
//       System.out.println(bir.returnszie(biri));



//Uzunluğu 5-dən böyük olanları seç
//List icine adlar qeyd edib
//Hamısını BÖYÜK HƏRFLƏ çap et
//
//       List <String>list1= List.of("Gunel","Muffy","zeze","Martin","Anakin");
//       list1.stream()
//               .filter(s -> s.length() > 5)
//               .forEach(s -> System.out.println(s.toUpperCase()));


//
//       List<Integer>list2=new ArrayList<>();
//       for(int i=0;i<=10;i++){
//           list2.add(i);
//       }
//       System.out.println(list2);
//
//       list2.stream()
//               .filter(n -> n % 2 != 0)
//               .forEach(System.out::println);


//
//       String[] a = {"1", "2", "3"};
//       String[] b = a;
//       b[0] = "10";
//       System.out.println(b[0]);
//       for(String s: b){
//           System.out.println(s);
//       }
//
//
//       System.out.println("'''''''''''''''''''");
//       for(String d: a){
//           System.out.println(d);
//       }


//
//       String[][] sehirler = {
//               {"İstanbul", "Ankara"},
//               {"İzmir", "Bursa"}
//       };
//       String [] ededler={"biri","ikisi"};
//       System.out.println(Arrays.deepToString(ededler));
//       System.out.println("----------------");
//       System.out.println();
//       // Standart toString kullanımı
//       System.out.println("Normal toString: " + Arrays.toString(sehirler));
//       System.out.println("=================================");
//       // deepToString kullanımı
//       System.out.println("Deep toString: " + Arrays.deepToString(sehirler));

//dd(7);

//
//       List<Integer>list1=new ArrayList<>();
//       list1.add(1);
//       list1.add(2);
//       list1.add(3);
//       list1.add(4);
//       list1.add(5);
//       list1.a

       System.out.println("helllooo");
   }




//
//       List <String> list3=List.of("gunel","arzu","aylin","guler");
//       list3.stream()
//               .filter(n->n.startsWith("a"))
//               .forEach(System.out::println);


//       List<Integer>list4 = List.of(1,2,3,4,3,3,4,5,6,7,8);
//       list4.stream()
//               .distinct().forEach(System.out::println);


//
//Map<String,Integer>employee=new HashMap<>();
//employee.put("gunel",1000);
//employee.put("farid",2000);
//employee.put("gulcin",3000);
//employee.put("qorxmaz",4000);

//employee.entrySet()
//        .stream().filter(s->s.getValue()>1000)
//        .forEach(s-> System.out.println(s));


//employee.entrySet().stream().filter(s->s.getValue()>1000)
//        .map(s->s.getKey())
//        .toList()
//        .forEach(s->employee.remove(s));
//
//
//       System.out.println(employee);







//employee.entrySet().stream().filter(s->s.getValue()>1000)
//        .map(s->s.getKey())
//        .toList()
//        .forEach(s-> {
//            System.out.println(s);
//            employee.remove(s);
//        });
//
//       System.out.println(employee);
//



//
//       employee.entrySet().stream()
//               .filter(s->s.getValue()>1000)
//               .toList()
//               .forEach(s->{
//                   System.out.println(s.getValue());
//                   cem+=s.getValue();
//                   count++;
//               });
//       System.out.println(cem/count);



//
//      double  a=  employee.entrySet().stream().mapToInt(s->s.getValue()).average().orElseThrow(
//              () -> new RuntimeException("000000")
//      );
//       System.out.println(a);



//
//
//       Map<String, Map<String, Integer>> corperate = new HashMap<>();
//
//       Map<String, Integer> IT = new HashMap<>();
//
//       IT.put("zehra", 2500);
//       IT.put("Farid", 3000);
//
//       Map<String,Integer> Smm=new HashMap<>();
//       Smm.put("gunay",2000);
//       Smm.put("arzu",3023);
//
//       Map<String,Integer> Reqemsal= new HashMap<>();
//       Reqemsal.put("nigar",1200);
//       Reqemsal.put("gunel",2300);
//
//       corperate.put("Smm",Smm);
//       corperate.put("IT",IT);
//       corperate.put("Reqemsal",Reqemsal);
//
//      // System.out.println(corperate);
//
//
//       corperate.entrySet().stream()
//               .toList()
//               .forEach(s-> System.out.println(s.getValue()));




       //tapsiriq
      // bir clas vavr icinde country var ,human clasidir human hansi countrydendir .bu list olsun ekrana cixsiinki hansi ollkeden nece insan var .


//countr ve adi var listin icine adamlari yig .ekrana cixsinki azerbaycandan 3 meselen britanyadan 10 insan var







//
//       Child c1=new Child("gunel",12);
//       Ata a1=new Ata("eldeniz",23);
//       c1.info();
//       a1.info();
//
//   }

//map solda dep adi map isci adi maasi
   // dev depde nece nefer isleyir onu yaz
    //depdekilerin maaslari cemi
    //100 den asagi maas alanlari silin
    //ve sirnda nece nefer qalib




//
//
//
//static int count =0;
//
//static int cem =0;
//

//
//int a=53;
//int b=a/3;
//b=2;
//       System.out.println(a);
//       System.out.println(b);
//
//
//
//
//       int [] arry={1,2,3,4,5,5,6,7};
//       Arrays.sort(arry);
//       int key=4;
//
//       System.out.println(key+" arrayda tapildi "+Arrays.binarySearch(arry,key));





//
//
//       List<Integer>list1=new ArrayList<>();
//       for(int i=0;i<100;i++){
//           list1.add(i);
//       }
//       System.out.println(list1);





      // list1.stream().map(a->a*10).filter(s->s>300).filter(d->d%2==0).forEach(f-> System.out.println(f));
//       list1.stream().map(a->a*10).
//               filter(s->s>300).
//               filter(d->d%2==0).
//               sorted(Collections.reverseOrder()).
//               forEach(q-> System.out.println(q));
//
//
//   }
//
//       }





//
//       Product p1= new Product("telefon",3,1000);
//       Product p2=new Product("adaptor",5,20);
//       Product p3=new Product("alma",23,30);
//
//       Customer c1=new Customer(10,"gulay");
//      // c1.buyProduct(p2,2);
//       System.out.println(c1.buyProduct(p2,9));






   }



/// listde stringler olsun sadece ilk herfi a olanlari cap etsin




//
//       Map<String , Map<String, Integer>> orders= new HashMap<>();
//       orders.put("samir",Map.of("telefon",1));
//       orders.put("gunel",Map.of("qelem",2));
//       orders.put("farid",Map.of("adaptor",4,"bayraq",1,"sac",2));
//       orders.put("gunay",Map.of("lovhe",1,"hdmi cabel",2));
//       System.out.println(orders);
//
//
//       int say=0;
//       int cem=0;
//       int max = 0 ;
//       String name = "";
//       ArrayList <Integer>list= new ArrayList<>();
//       for(var entry: orders.entrySet()){
//           for(var product : entry.getValue().entrySet()){
//               System.out.println(entry.getKey() +" "+ product.getKey() +" "+ product.getValue());
//               cem+= product.getValue();
//               say++;
//
//               if(max<product.getValue()){
//                   max= product.getValue();
//                   name=entry.getKey();
//               }
//
//           }
//       }
//
//       System.out.println("=======================================");
//       System.out.println("mehsul sayi: "+cem);
//       System.out.println("mehsul sayi "+say);
//       System.out.println("ortalama say "+(cem/say));
//       System.out.println("en cox mehsul "+name);
//
//
//       List<String> azliq = new ArrayList<>();
//
//       for (var entry : orders.entrySet()) {
//           if (entry.getValue().size() == 1) {
//               azliq.add(entry.getKey());
//           }
//       }
//
//       for (String ad : azliq) {
//           orders.remove(ad);
//       }
//
//       System.out.println(orders);
//


