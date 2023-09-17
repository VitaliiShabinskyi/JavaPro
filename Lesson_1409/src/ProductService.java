import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final List<Product> products;

    public ProductService(List<Product> products) {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void updateProduct(Product product) {

    }
    
    public void deleteProduct(Product product) {
        products.remove(product);
    }
    
    public double calculatePrice(Product product) {

        return product.getPrice();
    }

    public List<Product> getProducts() {
        return products;
    }
}