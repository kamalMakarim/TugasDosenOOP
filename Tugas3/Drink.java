public class Drink extends Product {
    private double volume;
    private String expDate;

    public Drink(String name, double price, int amount, double volume, String expDate) {
        super(name, price, amount); 
        this.volume = volume;
        this.expDate = expDate;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void print() {
        System.out.println("Drink [name=" + getName() + ", price=" + getPrice() + ", amount=" + getAmount() + ", volume=" + volume + ", expDate=" + expDate + "]");
    }
}
