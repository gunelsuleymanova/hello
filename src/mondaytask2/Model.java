package mondaytask2;

public class Model {

    private  String model;
    private int capacity;
    private double price ;
    private int releasedate;
    private Color color;


    public Model(String model, int capacity, double price, int releasedate,Color color) {
        this.model = model;
        this.capacity = capacity;
        this.price = price;
        this.releasedate = releasedate;
    }


    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public int getReleasedate() {
        return releasedate;
    }


    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", releasedate=" + releasedate +
                '}';
    }
}
