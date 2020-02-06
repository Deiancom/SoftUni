package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class E14DragonArmy {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(rd.readLine());
        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] tokens = rd.readLine().split(" ");
            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>() {{
                    put(name, new int[]{damage, health, armor});
                }});
            } else {
                if (!dragons.get(type).containsKey(name)) {
                    dragons.get(type).put(name, new int[]{damage, health, armor});
                } else {
                    dragons.get(type).get(name)[0] = damage;
                    dragons.get(type).get(name)[1] = health;
                    dragons.get(type).get(name)[2] = armor;
                }
            }
        }
        dragons.forEach((key, value) -> {
            double averageDamage;
            double averageHealth;
            double averageArmor;
            int[] data = new int[3];
            value.forEach((key1, value1) -> {
                int damage = value1[0];
                int health = value1[1];
                int armor = value1[2];
                data[0] += damage;
                data[1] += health;
                data[2] += armor;

            });
            averageDamage = data[0] / (value.size() * 1.00);
            averageHealth = data[1] / (value.size() * 1.00);
            averageArmor = data[2] / (value.size() * 1.00);
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, averageDamage, averageHealth, averageArmor);

            value.forEach((key1, value1) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", key1,
                    value1[0], value1[1], value1[2]));
        });
    }
}
