package examPreparation.Aquarium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aquarium {
    private List<Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        for (var f : fishInPool) {
            if (f.getName().equals(fish.getName())) {
                return;
            }
        }
        if (getFishInPool() < getSize() && getFishInPool()<getCapacity()) {
            fishInPool.add(fish);
        }
    }


    public boolean remove(String name) {
        for (var f : fishInPool) {
            if (name.equals(f.getName())) {
                fishInPool.remove(f);
                return true;
            }
        }
        return false;
    }


    public Fish findFish(String name) {
        if(!fishInPool.isEmpty()) {
            for (Fish f : fishInPool) {
                if (name.equals(f.getName())) {
                    return f;
                }
            }
        }
        return null;
    }


    public String report() {
        return "Aquarium: " + name + " ^ Size: " + size + System.lineSeparator()
                + fishInPool.stream().map(Fish::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}

