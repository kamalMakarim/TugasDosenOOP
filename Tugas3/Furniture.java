public class Furniture extends Product {
    private String type;
    private String size;

    public Furniture(String name, double price, int amount, String type, String size) {
        super(name, price, amount); 
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void print() {
        System.out.println("Furniture [name=" + getName() + ", price=" + getPrice() + ", amount=" + getAmount() + ", type=" + type + ", size=" + size + "]");
    }
}
