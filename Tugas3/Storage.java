class Storage {
    private Product[] availableProducts;
    public int productCount;
    

    public Storage(int maxSize) {
        availableProducts = new Product[maxSize];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < availableProducts.length) {
            availableProducts[productCount++] = product;
        } else {
            System.out.println("Storage is full. Cannot add more products.");
        }
    }

    public void showAvailableProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < productCount; i++) {
            System.out.println(availableProducts[i]);
        }
    }
    
    public boolean transactionValidator(Cart cart){
        for(int i=0 ; i<cart.itemCount ; i++){
            for(int j=0 ; j<productCount ; j++){
                if(cart.items[i].getName() == availableProducts[j].getName()){
                    if(cart.items[i].getAmount() > availableProducts[j].getAmount()){
                        System.out.println("Not enough stock is available");
                        return false;
                    }
                    break;
                }
            }   
        }
        System.out.println("Transaction succeed");
        return true;
    }
}
