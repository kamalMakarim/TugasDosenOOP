public class Car implements Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " Car started");
    }

    @Override
    public void stop() {
        System.out.println(model + " Car stopped");
    }

    @Override
    public String getInfo() {
        return model + " Car";
    }
}
