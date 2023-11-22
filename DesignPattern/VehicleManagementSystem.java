public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Singleton
        VehicleRegistry registry = VehicleRegistry.getInstance();

        // Factory Method
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle("Sedan");

        // Abstract Factory
        VehicleAbstractFactory abstractFactory = new CarAbstractFactory();
        Vehicle abstractCar = abstractFactory.createVehicle();
        Engine engine = abstractFactory.createEngine();

        // Builder
        VehicleBuilder builder = new CarBuilder();
        VehicleDirector director = new VehicleDirector();
        Vehicle customCar = director.construct(builder);

        // Print information
        System.out.println("Singleton: " + registry);
        System.out.println("Factory Method: " + car.getInfo());
        System.out.println("Abstract Factory: " + abstractCar.getInfo());
        System.out.println("Builder: " + customCar.getInfo());
    }
}