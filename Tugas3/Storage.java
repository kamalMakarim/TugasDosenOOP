public class Storage {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Soda", 1.99, 50, 12.0, "2023-12-31");
        Food food1 = new Food("Chocolate", 2.49, 30, "2023-10-15");
        HomeAppliance HomeAppliance1 = new HomeAppliance("Blender", 49.99, 10, "Krisbow", "version 1");

        System.out.println("Product Information:");
        drink1.print();
        food1.print();
        HomeAppliance1.print();

        drink1.setPrice(1.79);
        food1.setAmount(20);
        HomeAppliance1.setBrand("LG");
        
        System.out.println("\nUpdated Product Information:");
        drink1.print();
        food1.print();
        HomeAppliance1.print();
    }
}
