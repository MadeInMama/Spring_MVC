package web.model;

public class Car {
    private static final Car[] Cars = new Car[]{
            new Car("Toyota", "Mark II", "12-13"),
            new Car("Toyota", "GT86", "68-14"),
            new Car("Toyota", "Supra A90", "38-57"),
            new Car("Toyota", "Supra A80", "12-13"),
            new Car("Nissan", "Laurel", "36-38"),
            new Car("Nissan", "GT-R 34", "62-89"),
    };

    private final String Brand;
    private final String Model;
    private final String StateNumber;

    public Car(String brand, String model, String stateNumber) {
        Brand = brand;
        Model = model;
        StateNumber = stateNumber;
    }

    public static Car[] getCars() {
        return Cars;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getStateNumber() {
        return StateNumber;
    }
}
