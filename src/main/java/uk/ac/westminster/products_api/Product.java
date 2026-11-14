package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    // empty constructor: Jackson needs it to build a Product from POST JSON
    public Product() {
    }

    // full constructor: for your own code
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // GETTERS: Jackson uses these to write the JSON
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // SETTERS: the service uses setId(); Jackson uses all three when JSON comes in
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}