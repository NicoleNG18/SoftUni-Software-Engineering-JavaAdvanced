package examPreparation.Dealership;

public class Main {

    public static void main(String[] args) {

        Dealership dealership = new Dealership("Autofest", 5);

        Car volvo = new Car("Volvo", "XC70", 2010);

        System.out.println(volvo);

        dealership.add(volvo);

        System.out.println(dealership.buy("Volvo", "XC90"));
        System.out.println(dealership.buy("Volvo", "XC70"));

        Car peugeot = new Car("Peugeot", "307", 2011);
        Car audi = new Car("Audi", "S4", 2005);

        dealership.add(peugeot);
        dealership.add(audi);

        Car latestCar = dealership.getLatestCar();
        System.out.println(latestCar);

        Car audiS4 = dealership.getCar("Audi", "S4");
        System.out.println(audiS4);

        System.out.println(dealership.getCount());

        System.out.println(dealership.getStatistics());

    }
}

