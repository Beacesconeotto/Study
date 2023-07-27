package dto;


import javax.validation.constraints.NotBlank;

public class ProductDto {
    private int id;

    @NotBlank
    private String name;

    @NotBlank
    private double price;


    public ProductDto(int id, String name, double price ) {

    }

    public ProductDto() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPreco(double price) {
        this.price = price;
    }
}
