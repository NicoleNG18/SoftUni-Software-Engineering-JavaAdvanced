package setAndMapAdvanced.lab;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Product>> products = new TreeMap<>();

        doTheCommands(scanner, input, products);

        output(products);
    }

    private static void output(Map<String, List<Product>> products) {

        for (Map.Entry<String, List<Product>> entry : products.entrySet()) {

            System.out.println(entry.getKey() + "->");

            for (Product pr : entry.getValue()) {
                System.out.printf("Product: %s, Price: %.1f%n", pr.getName(), pr.getPrice());
            }

        }

    }

    private static void doTheCommands(Scanner scanner, String input, Map<String, List<Product>> products) {
        while (!input.equals("Revision")) {

            String[] arr = input.split(", ");

            String shop = arr[0];
            String product = arr[1];
            double price = Double.parseDouble(arr[2]);

            products.putIfAbsent(shop, new ArrayList<>());

            products.get(shop).add(new Product(product, price));

            input = scanner.nextLine();
        }

    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

    }


}
