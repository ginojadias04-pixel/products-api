package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                    // this class answers web requests
@RequestMapping("/products")       // every URL here starts with /products
public class ProductController {

    @GetMapping("/{id}")           // {id} is a slot in the URL
    public Product getById(@PathVariable Long id) {    // copies the number from the URL into id
        return new Product(id, "Laptop", 999.99);
    }
}