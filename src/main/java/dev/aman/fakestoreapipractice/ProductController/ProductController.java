package dev.aman.fakestoreapipractice.ProductController;

import dev.aman.fakestoreapipractice.Models.Product;
import dev.aman.fakestoreapipractice.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    private ProductService productService;

    private RestTemplate restTemplate;

    @Autowired
    public ProductController(ProductService productService, RestTemplate restTemplate) {
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/product/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) {
        return productService.getSingleProduct(productId);
    }
}
