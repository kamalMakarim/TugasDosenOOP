class Cart {
    public Product[] items;
    public int itemCount;
    public double totalPrice;

    public Cart(int maxSize) {
        items = new Product[maxSize];
        itemCount = 0;
    }

    public void addToCart(Product product) {
        if (itemCount < items.length) {
            items[itemCount++] = product;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
        
        countTotalPrice();
    }

    public void removeFromCart(String itemName) {
        int index;
        
        for (index = 0 ; index < itemCount ; index++){
            if(items[index].getName() == itemName){
                break;
            }
        }
        
        for (int i = index; i < itemCount - 1; i++) {
            items[i] = items[i + 1];
        }
        items[itemCount - 1] = null;
        itemCount--;
        
        countTotalPrice();
    }

    public void showCart() {
        System.out.println("Shopping Cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
        System.out.println("total price: " + totalPrice);
    }
    
    private void countTotalPrice(){
        double sum=0;
        for(int i=0 ; i<itemCount ; i++){
            sum+= items[i].getPrice() * items[i].getAmount();
        }
        this.totalPrice = sum;
    }
}