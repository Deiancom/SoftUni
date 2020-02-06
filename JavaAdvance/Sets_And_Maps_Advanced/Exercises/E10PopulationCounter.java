package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E10PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Long>> countryAndCount = new LinkedHashMap<>();
        Map<String, Long> cityAndPopulation = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);
            if (!countryAndCount.containsKey(country)) {
                countryAndCount.put(country, new LinkedHashMap<>());
                countryAndCount.get(country).put(city, population);
                cityAndPopulation.put(country, population);
            } else {
                long current = cityAndPopulation.get(country);
                cityAndPopulation.put(country, population + current);
                countryAndCount.get(country).put(city, population);
            }
            input = scanner.nextLine();
        }
        countryAndCount.entrySet().stream()
                .sorted((c1, c2) -> cityAndPopulation.get(c2.getKey()).compareTo(cityAndPopulation.get(c1.getKey())))
                .forEach(nation -> {
                    System.out.printf("%s (total population: %d)%n", nation.getKey(),
                            cityAndPopulation.get(nation.getKey()));
                    nation.getValue().entrySet()
                            .stream().sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                            .forEach(town -> System.out.printf("=>%s: %d%n", town.getKey(), town.getValue()));
                });
    }
}
