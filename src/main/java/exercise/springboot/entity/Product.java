package exercise.springboot.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "ProductTable")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChassi;

    @NotBlank
    private String name;


    private double price;

    private int quantidade;


    public Product() {
        this.idChassi = idChassi;
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getidChassi() {
        return idChassi;
    }

    public void setidChassi (Long idChassi) {
        this.idChassi = idChassi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idChassi=" + idChassi +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
