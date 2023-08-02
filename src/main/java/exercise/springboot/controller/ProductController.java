package exercise.springboot.controller;

import exercise.springboot.Service.ProductService;
import exercise.springboot.entity.Product;
import exercise.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    private List <Product> produtos = new ArrayList<>();




    @PostMapping
    public Product createProduto(@RequestBody Product product) {
        produtos.add(product);
        return product;
    }

    @GetMapping("/get/{idChassi}")
    public Product getProductByChassi(@PathVariable Long idChassi) {
        Product productDto = productService.getProductByChassi(idChassi);

        return productDto;
    }

    @PutMapping
    public Product updateProduct(@PathVariable long idChassi, @RequestBody Product product){
        Product updateProduct = productRepository.findByIdChassi(idChassi);

        updateProduct.setName(product.getName());
        updateProduct.setPrice(product.getPrice());
        updateProduct.setQuantidade(product.getQuantidade());

        productRepository.save(updateProduct);

        return updateProduct;
    }

}

