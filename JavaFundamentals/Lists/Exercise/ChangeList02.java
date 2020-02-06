package JavaFundamentals.Lists.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = reader.readLine();

        while (!line.equals("end")) {

            String[] input = line.split("\\s+");
            String cmd = input[0];


            int element = Integer.parseInt(input[1]);
            if (cmd.equals("Delete")) {


                while (numbers.contains(element)) {
                    numbers.remove(Integer.valueOf(element));
                }
            } else {
                int index = Integer.parseInt(input[2]);
                if (index < numbers.size()) {
                    numbers.add(index, element);
                }


            }

            line = reader.readLine();
        }

        numbers.forEach(e -> System.out.print(e + " "));
    }
}
