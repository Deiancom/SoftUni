package JavaAdvance.Sets_And_Maps_Advanced.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double[] inputNumbers = Arrays.stream(rd.readLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numbers = new LinkedHashMap<>();
        for (double inputNumber : inputNumbers) {
            numbers.putIfAbsent(inputNumber, 0);
            if (numbers.containsKey(inputNumber)) {
                int current = numbers.get(inputNumber);
                current++;
                numbers.put(inputNumber, current);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
