package exercise.springboot.dto;


import javax.validation.constraints.NotBlank;

public class ProductDto {
    private Long idChassi;

    @NotBlank
    private String name;


    private double price;

    private int quantidade;


    public ProductDto(int idChassi, String name, double price, int quantidade ) {

    }

    public ProductDto() {

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

    public void setidChassi(Long idChassi) {
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

    public void setPreco(double price) {
        this.price = price;
    }
}
