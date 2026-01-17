package taskuc;
import java.util.ArrayList;
import java.util.Arrays;
public class Marka {

   private Phone [] phone;
   private ArrayList<Phone> phones;

   private String brandname;

    public Marka(String brandname, Phone [] phone){
        this.phone=phone;
        //this.brandname=brandname;
    }

    public Phone[] getPhone() {
        return phone;
    }

    public void setPhone(Phone[] phone) {
        this.phone = phone;
    }

    public void info() {
        for(Phone a:phone){
            if (a.getStorage()>180){
                System.out.println(a);
            }
        }


    }


    public int getTotalStorage(int a) {

    return a;
    }

//        return brandname + " "+ phone;
       // System.out.println(brandname+" "+phone);
//        for(Phone p : phone){
//            System.out.println(p);
//        }


        // System.out.println(brandname+" " +Arrays.toString(phone));


    @Override
    public String toString() {
        return "Marka{" + "phone=" + Arrays.toString(phone) + ", brandname='" + brandname +" "+  '\'' + '}';
    }


    //
//    @Override
//    public String toString() {
//        return "Marka{" +
//                "phone=" + Arrays.toString(phone) +
//                '}';
//    }
}
