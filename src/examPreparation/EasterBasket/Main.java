package examPreparation.EasterBasket;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket("Wood", 20);

        Egg egg = new Egg("Red", 10, "oval");

        System.out.println(egg);

        basket.addEgg(egg);

        System.out.println(basket.removeEgg("Pink"));

        Egg secondEgg = new Egg("Green", 9, "pointy");

        basket.addEgg(secondEgg);

        Egg strongestEgg = basket.getStrongestEgg();

        System.out.println(strongestEgg);

        Egg getEgg = basket.getEgg("Green");
        System.out.println(getEgg);

        System.out.println(basket.report());

    }
}

