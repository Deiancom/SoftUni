package JavaFundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokemonPower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int badLuck = Integer.parseInt(scanner.nextLine());
        int halfPower = pokemonPower / 2;
        int count = 0;

        while (pokemonPower >= distance) {
            pokemonPower -= distance;
            count++;
            if (pokemonPower == halfPower && badLuck > 0) {
                pokemonPower /= badLuck;
            }
        }
        System.out.println(pokemonPower);
        System.out.println(count);
    }
}
