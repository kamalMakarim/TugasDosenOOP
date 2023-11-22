public class CarAbstractFactory implements VehicleAbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car("Default");
    }

    @Override
    public Engine createEngine() {
        return new CarEngine();
    }
}