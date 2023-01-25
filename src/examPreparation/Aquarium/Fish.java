package examPreparation.Aquarium;

public class Fish {
    private int fins;
    private String name;
    private String color;

    public Fish(String name, String color,int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    public int getFins() {
        return fins;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fish: " + this.getName() + System.lineSeparator() +
                "Color: " + this.getColor() + System.lineSeparator() +
                "Number of fins: " + this.getFins();

    }
}

