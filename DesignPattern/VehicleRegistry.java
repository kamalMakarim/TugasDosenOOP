public class VehicleRegistry {
    private static VehicleRegistry instance;

    private VehicleRegistry() {
        // Private constructor to prevent instantiation
    }

    public static VehicleRegistry getInstance() {
        if (instance == null) {
            instance = new VehicleRegistry();
        }
        return instance;
    }

    // Other methods related to vehicle registry
}