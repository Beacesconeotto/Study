package exercise.springboot.Service;

import exercise.springboot.dto.ProductDto;
import exercise.springboot.entity.Product;
import org.springframework.stereotype.Service;
import exercise.springboot.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;



    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

     public boolean registerProduct(ProductDto productDto) {

         System.out.println("dahsl");

         Product product = new Product();
         product.setidChassi(productDto.getidChassi());
         product.setName(productDto.getName());
         product.setPrice(productDto.getPrice());


         productRepository.save(product);

          return true;
     }
     public Product getProductByChassi (Long idChassi) {
        return productRepository.findByIdChassi(idChassi);
     }

}
