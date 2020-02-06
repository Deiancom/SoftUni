package JavaAdvance.Sets_And_Maps_Advanced.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class E02SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] setsSize = Arrays.stream(rd.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sizeOne = setsSize[0];
        int sizeTwo = setsSize[1];
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        while (sizeOne-- > 0) {
            int num = Integer.parseInt(rd.readLine());
            firstSet.add(num);
        }
        while (sizeTwo-- > 0) {
            int num = Integer.parseInt(rd.readLine());
            secondSet.add(num);
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach((e -> System.out.printf("%d ", e)));
    }
}
