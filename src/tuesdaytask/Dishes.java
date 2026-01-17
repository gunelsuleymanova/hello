package tuesdaytask;

import java.util.Arrays;

public class Dishes {

    private String name;
    private int price;
    private String [] ingridient;
    public Dishes(String name,int price,String[] ingridient){
        this.name=name;
        this.price=price;
        this.ingridient=ingridient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getIngridient() {
        return ingridient;
    }

    public void setIngridient(String[] ingridient) {
        this.ingridient = ingridient;
    }



    @Override
    public String toString() {
        return "Dishes{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingridient=" + Arrays.toString(ingridient) +
                '}';
    }
}
