package controller;

import Service.ProductService;
import dto.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;

        System.out.println("hdsauha");
    }


    @PostMapping("/post")
    public ResponseEntity <String> registerProduct(@Valid @RequestBody ProductDto productDto) {

        boolean registerProduct = productService.registerProduct(productDto);
        if (registerProduct) {
            return ResponseEntity.ok("Car registered successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to register car.");
        }

    }

}
