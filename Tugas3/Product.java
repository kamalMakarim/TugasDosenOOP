class Product {
    private String name;
    private double price;
    private int amount;
    
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setAmount(int amount){
        this.amount = amount;
    }
}

// The Cart class represents a shopping cart.