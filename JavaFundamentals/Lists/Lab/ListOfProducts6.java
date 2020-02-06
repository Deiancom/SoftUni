package JavaFundamentals.Lists.Lab;

import java.util.*;

public class ListOfProducts6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < inputNumber ; i++) {
            String typeOfProduct = scanner.nextLine();
            products.add(typeOfProduct);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size() ; i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
