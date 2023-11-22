public class CarBuilder implements VehicleBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car("Default");
    }

    @Override
    public void buildModel() {
        // Implementation for building car model
        car = new Car("Custom");
    }

    @Override
    public void buildEngine() {
        // Implementation for building car engine
        car.start(); // Simulating starting the engine during construction
    }

    @Override
    public Vehicle getResult() {
        return car;
    }
}