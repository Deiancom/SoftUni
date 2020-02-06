package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productsAndFinalPrice = new LinkedHashMap<>();
        Map<String, Integer> checkQuantity = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy")) {
                break;
            }
            String[] command = input.split("\\s+");
            String nameOfProduct = command[0];
            double price = Double.parseDouble(command[1]);
            int quantity = Integer.parseInt(command[2]);
            double finalPrice = price * quantity;

            if (productsAndFinalPrice.containsKey(nameOfProduct)) {
                int lastQuantity = checkQuantity.get(nameOfProduct) + quantity;
                checkQuantity.put(nameOfProduct, lastQuantity);
                finalPrice = price * lastQuantity;
                productsAndFinalPrice.put(nameOfProduct, finalPrice);
            } else {
                productsAndFinalPrice.putIfAbsent(nameOfProduct, finalPrice);
                checkQuantity.putIfAbsent(nameOfProduct, quantity);
            }
        }
        for (Map.Entry<String, Double> entry : productsAndFinalPrice.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
