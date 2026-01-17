package task3;

public class ProductRepository extends Repository <Product>{


    @Override
    public void save(Product data) {
        System.out.println("Product saved: " + data.getTitle());
    }

    @Override
    public Product findById(int id) {
        return new Product("laptop");
    }
}
