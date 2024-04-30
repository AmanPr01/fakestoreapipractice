package dev.aman.fakestoreapipractice.Services;

import dev.aman.fakestoreapipractice.DTOS.FakeStoreProductDTO;
import dev.aman.fakestoreapipractice.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("productServiceImplfakestore")
public class ProductServiceImplfakestore implements ProductService {

    RestTemplate restTemplate;

    public ProductServiceImplfakestore(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Product getSingleProduct(Long productId) {

        // we need to call the URL of fake store through rest template

        FakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + productId, FakeStoreProductDTO.class); // getting the response from fakestore URL(which is in JSON format) and saving those in the FakeStoreDTO class to convert to the java POJO.

        // return the product so that we can see in postman

        return fakeStoreProductDTO.toProduct();
    }
}
