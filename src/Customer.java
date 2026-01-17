//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Customer {
//    private String fullname;
//    private double budce ;
//    List<Product>products=new ArrayList<>();
//
//    public Customer(double budce,String fullname){
//        this.budce=budce;
//        this.fullname=fullname;
//    }
//


//    public String buyProduct(Product p,int say){
//        if(p.getCount()>=say){
//            if(p.getPrice() * say<=budce){
//                products.add(p);
//            }else {
//               return "ala bilmrsen budcen kifayet etmir ";
//            }
//        }
//        else {
//            return "kifayet qeder mehsul yoxdur ";
//        }
//        return say+" eded "+ p.getName()+" : mehsulu aldin ";
//    }
//


//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "budce=" + budce +
//                ", list1=" + products +
//                '}';
//    }
//}
