// Concrete factory for creating cars
public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model) {
        return new Car(model);
    }
}