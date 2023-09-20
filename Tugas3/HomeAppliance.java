public class HomeAppliance extends Product {
    private String brand;
    private String model;

    public HomeAppliance(String name, double price, int amount, String brand, String model) {
        super(name, price, amount);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println("HomeAppliance [name=" + getName() + ", price=" + getPrice() + ", amount=" + getAmount() +", brand=" + brand + ", model=" + model + "]");
    }
}
