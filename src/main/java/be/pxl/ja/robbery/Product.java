package be.pxl.ja.robbery;

public class Product {
    private double weight;
    private double price;
    private String name;

    public Product() {
    }

    public Product(String name, double weight, double price) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Product product) {
        return Double.compare(this.getPrice(), product.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
