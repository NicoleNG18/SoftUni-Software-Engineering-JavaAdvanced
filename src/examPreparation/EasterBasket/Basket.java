package examPreparation.EasterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (getCount() < capacity) {
            data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        for (var e:data) {
            if(color.equals(e.getColor())){
                data.remove(e);
                return true;
            }
        }
        return false;
    }

    public Egg getStrongestEgg() {
        if(!data.isEmpty()) {
            return data.stream().max(Comparator.comparing(Egg::getStrength)).get();
        }
        return null;
    }

    public Egg getEgg(String color) {
        for (var e:data) {
            if(color.equals(e.getColor())){
                return e;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        return material + " basket contains:" + System.lineSeparator()
                + data.stream().map(Egg::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}

