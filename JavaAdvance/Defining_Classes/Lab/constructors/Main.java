package JavaAdvance.Defining_Classes.Lab.constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[] info = scanner.nextLine().split(" ");
            String make = info[0];
            String model = "unknown";
            int horsePower = -1;
            if (info.length == 2 && Character.isDigit(info[1].charAt(0))) {
                horsePower = Integer.parseInt(info[1]);
            } else if (info.length == 3) {
                model = info[1];
                horsePower = Integer.parseInt(info[2]);
            }

            Car car = new Car(make, model, horsePower);
            car.setMake(make);
            car.setModel(model);
            car.setPower(horsePower);
            cars.add(car);
        }
        cars.forEach(e -> System.out.printf("The car is: %s %s - %d HP.%n",
                e.getMake(), e.getModel(), e.getPower()));
    }
}
