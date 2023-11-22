public class VehicleRegistry {
    private static VehicleRegistry instance;
    public String owner;

    private VehicleRegistry(String owner) {
        this.owner = owner;
    }

    public static VehicleRegistry getInstance() {
        if (instance == null) {
            instance = new VehicleRegistry("Satrio");
        }
        return instance;
    }
}