package CaseStudy;

public class Product {
    private String name;
    private int price;
    private int stock_quantity;
    private String Taxation_specifics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public String getTaxation_specifics() {
        return Taxation_specifics;
    }

    public void setTaxation_specifics(String taxation_specifics) {
        Taxation_specifics = taxation_specifics;
    }

    public Product(String name, int price, int stock_quantity, String taxation_specifics) {
        this.name = name;
        this.price = price;
        this.stock_quantity = stock_quantity;
        Taxation_specifics = taxation_specifics;
    }

    public boolean equals(Object o){
      Product p =(Product) o;
      return p.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock_quantity=" + stock_quantity +
                ", Taxation_specifics='" + Taxation_specifics + '\'' +
                '}';
    }
}
