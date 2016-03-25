package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);
    List<Product> getProductsByName(String name);
}
