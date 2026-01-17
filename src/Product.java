public class Product {
    private String name ;
    private int count ;
    private double price;


    public Product(String name ,int count,double price){
        this.name=name;
        this.count=count;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
