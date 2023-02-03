package examPreparation.vetClinic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (getCount() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (var e : data) {
            if (name.equals(e.getName())) {
                data.remove(e);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (var e : data) {
            if (name.equals(e.getName()) && owner.equals(e.getOwner())) {
                return e;
            }
        }
        return null;
    }

    public Pet getOldestPet() {
        if(!data.isEmpty()) {
            return data.stream().max(Comparator.comparing(Pet::getAge)).get();
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        return "The clinic has the following patients:" + System.lineSeparator()
                + data.stream().map(e->String.format("%s %s",e.getName(),e.getOwner()))
                .collect(Collectors.joining(System.lineSeparator()));
    }

}

