package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class E06MinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        while (true) {
            String resource = rd.readLine();
            if (resource.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(rd.readLine());
            if (resourceMap.containsKey(resource)) {
                int backup = resourceMap.get(resource);
                backup += quantity;
                resourceMap.put(resource, backup);
            } else {
                resourceMap.put(resource, quantity);
            }

        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}


