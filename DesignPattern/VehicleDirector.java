public class VehicleDirector {
    public Vehicle construct(VehicleBuilder builder) {
        builder.buildModel();
        builder.buildEngine();
        return builder.getResult();
    }
}