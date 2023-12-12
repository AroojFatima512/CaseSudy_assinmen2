package CaseStudy;

public class Electronics extends Product{
    private int power_consumption;
    private int warranty;

    public Electronics(String name, int price, int stock_quantity, String taxation_specifics, int power_consumption, int warranty) {
        super(name, price, stock_quantity, taxation_specifics);
        this.power_consumption = power_consumption;
        this.warranty = warranty;
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +"name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", stock_quantity=" + getStock_quantity() +
                ", Taxation_specifics='" + getTaxation_specifics() + '\'' +
                "power_consumption=" + power_consumption +
                ", warranty=" + warranty +
                '}';
    }
}
