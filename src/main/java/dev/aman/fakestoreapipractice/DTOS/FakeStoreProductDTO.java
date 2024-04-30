package dev.aman.fakestoreapipractice.DTOS;

import dev.aman.fakestoreapipractice.Models.Category;
import dev.aman.fakestoreapipractice.Models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDTO {

    private Long id;

    private String title;

    private String image;

    private String description;

    private String category;

    private double price;

    // the above attributes are from FakeStoreAPI (JSON)

    public Product toProduct() {

        Product product = new Product();

        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setImageURL(image);
        product.setPrice(price);

        Category cat = new Category();
        cat.setTitle(category);

        product.setCategory(cat);

        return product;
    }
}
