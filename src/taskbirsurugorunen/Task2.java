package taskbirsurugorunen;

import tasko.Main;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
   public Queue<Integer> numbers=new LinkedList<>();


    public static void main(String[] args) {
        Task2 new1=new Task2();
        new1.numbers.add(2);
        new1.numbers.add(3);
        new1.numbers.add(1);
        new1.numbers.add(6);
        new1.numbers.add(9);
        System.out.println(new1.numbers);
        int a= new1.numbers.size();
        System.out.println(a);
        while (true){
            if(a>0) {
                new1.numbers.poll();
                a--;
            }else{
                System.out.println("bosss");
                break;

            }
        }
    }
    }













//
//    public void remove1(){
//        try{
//        numbers.poll();
//        throw new RuntimeException("lll");
//    }catch (RuntimeException k){
//            System.out.println(k.getMessage());
//        }









//
//    @Override
//    public String toString() {
//        return "Task2{" +
//                "numbers=" + numbers +
//                '}';
//    }

//    public static void main(String[] args) {
//
//
//
//        Task2 new1= new Task2();
//        new1.numbers.add(1);
//        new1.numbers.add(4);
//        new1.numbers.add(2);
//        new1.add1(5);
//        System.out.println(new1.numbers);
//        new1.remove1();
//        System.out.println(new1.numbers);
//
//        Queue<Integer> numbers=new LinkedList<>();
//        numbers.add(102);
//        numbers.add(20);
//        numbers.add(303);

