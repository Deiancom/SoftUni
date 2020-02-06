package JavaFundamentals.MapsLambdaStreamAPI.Exercise;

import java.util.*;

public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> nameAndGrade = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (nameAndGrade.containsKey(student)) {
                nameAndGrade.get(student).add(grade);
            } else {
                nameAndGrade.putIfAbsent(student, new ArrayList<>());
                nameAndGrade.get(student).add(grade);
            }
        }
        Map<String, Double> averageGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : nameAndGrade.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50) {
                averageGrade.put(entry.getKey(), average);
            }
        }
        averageGrade.entrySet().stream()
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.printf("%s -> %.2f%n", grade.getKey(), grade.getValue());
                });
    }
}
