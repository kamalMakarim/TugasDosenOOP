public class GroceryStore {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 12000, 100);
        Product bread = new Product("Bread", 20000, 100);
        Product eggs = new Product("Eggs", 15000, 100);

        Storage storage = new Storage(10);
        storage.addProduct(milk);
        storage.addProduct(bread);
        storage.addProduct(eggs);

        Cart cart = new Cart(5); 
        milk.setAmount(50);
        cart.addToCart(milk);
        bread.setAmount(70);
        cart.addToCart(bread);
        
        if(storage.transactionValidator(cart) == true){
            storage.showAvailableProducts();
            cart.showCart();
        }
    }
    
}