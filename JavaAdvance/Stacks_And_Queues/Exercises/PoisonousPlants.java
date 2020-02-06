package JavaAdvance.Stacks_And_Queues.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PoisonousPlants {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buffer.readLine());

        String[] plants = buffer.readLine().split(" ");

        ArrayDeque<Integer> plantIndexes = new ArrayDeque<>();
        plantIndexes.push(0);

        int[] days = new int[n];

        for (int i = 0; i < n; i++) {

            int maxDays = 0;

            while (plantIndexes.size() > 0 && Integer.parseInt(plants[plantIndexes.peek()]) >= Integer.parseInt(plants[i])) {
                maxDays = Math.max(maxDays, days[plantIndexes.pop()]);
            }

            if (plantIndexes.size() > 0) {
                days[i] = maxDays + 1;
            }

            plantIndexes.push(i);
        }
        System.out.println(dayPlansStopDying(days));
    }

    private static int dayPlansStopDying(int[] days) {
        int max = Integer.MIN_VALUE;
        for (int day : days) {
            if (day > max) {
                max = day;
            }
        }
        return max;
    }
}
