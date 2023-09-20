public class Storage {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Soda", 1.99, 50, 12.0, "2023-12-31");
        Food food1 = new Food("Chocolate", 2.49, 30, "2023-10-15");
        Furniture furniture1 = new Furniture("Chair", 49.99, 10, "Wooden", "Medium");

        System.out.println("Product Information:");
        System.out.println(drink1);
        System.out.println(food1);
        System.out.println(furniture1);

        drink1.setPrice(1.79);
        food1.setAmount(20);
        furniture1.setSize("Large");
        
        System.out.println("\nUpdated Product Information:");
        System.out.println(drink1);
        System.out.println(food1);
        System.out.println(furniture1);
    }
}
