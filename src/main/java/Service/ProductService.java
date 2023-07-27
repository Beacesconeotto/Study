package Service;

import dto.ProductDto;
import entity.Product;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;



    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
     }

     public boolean registerProduct(ProductDto productDto) {

         System.out.println("dahsl");

         Product product = new Product();
         product.setId(productDto.getId());
         product.setName(productDto.getName());
         product.setPrice(productDto.getPrice());


         productRepository.save(product);

          return true;
     }
}
