package definingClasses.carTaskSecond;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String carInfo() {

        return String.format("The car is: %s %s - %d HP.",
                getBrand(),
                getModel(),
                getHorsepower());

    }

    @Override
    public String toString() {
        return carInfo();
    }

}



