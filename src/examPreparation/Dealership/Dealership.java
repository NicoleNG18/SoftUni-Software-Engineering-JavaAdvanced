package examPreparation.Dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dealership {
    public String name;
    public int capacity;
    public List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (getCount() < capacity) {
            data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        for (var e : data) {
            if (model.equals(e.getModel()) && manufacturer.equals(e.getManufacturer())) {
                data.remove(e);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        if (!data.isEmpty()) {
            return data.stream().max(Comparator.comparing(Car::getYear)).get();

        }
        return null;
    }

    public Car getCar(String manufacturer, String model) {
        for (var e : data) {
            if (model.equals(e.getModel()) && manufacturer.equals(e.getManufacturer())) {
                return e;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        return "The cars are in a car dealership " + name + ":" + System.lineSeparator() +
                data.stream().map(Car::toString)
                        .collect(Collectors.joining(System.lineSeparator()));

    }

}

