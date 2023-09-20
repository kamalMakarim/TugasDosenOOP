public class Food extends Product {
    private String expDate;

    public Food(String name, double price, int amount, String expDate) {
        super(name, price, amount); 
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void print() {
        System.out.println("Food [name=" + getName() + ", price=" + getPrice() + ", amount=" + getAmount() + ", expDate=" + expDate + "]");
    }
}
