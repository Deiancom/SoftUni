package JavaAdvance.Sets_And_Maps_Advanced.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        Map<String, List<Double>> studentMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = rd.readLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!studentMap.containsKey(name)) {
                studentMap.putIfAbsent(name, new ArrayList<>());
            }
            studentMap.get(name).add(grade);
        }
        studentMap.forEach((key, value) -> {
            double average = value.stream()
                    .mapToDouble(val -> val).average().orElse(0.0);
            System.out.printf("%s -> ", key);
            value.forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", average);

        });
    }
}
