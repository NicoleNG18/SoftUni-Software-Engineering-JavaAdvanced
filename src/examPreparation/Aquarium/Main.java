package examPreparation.Aquarium;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium("Ocean", 5, 15);

        Fish fish = new Fish("Goldy", "gold", 4);

        System.out.println(fish);

        aquarium.add(fish);

        aquarium.findFish("Goldy");

        aquarium.getFishInPool();

        System.out.println(aquarium.remove("Goldy")); // true

        Fish secondFish = new Fish("Dory", "blue", 2);
        Fish thirdFish = new Fish("Nemo", "orange", 5);

        aquarium.add(secondFish);
        aquarium.add(thirdFish);

        System.out.println(aquarium.report());




    }
}

