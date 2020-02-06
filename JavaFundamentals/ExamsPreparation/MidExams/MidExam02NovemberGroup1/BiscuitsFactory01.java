package JavaFundamentals.ExamsPreparation.MidExams.MidExam02NovemberGroup1;

import java.util.*;

public class BiscuitsFactory01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsPerWorker = Integer.parseInt(scanner.nextLine());
        int factoryWorker = Integer.parseInt(scanner.nextLine());
        int biscuitsFromOtherFactory = Integer.parseInt(scanner.nextLine());
        int allBiscuitsBeforeTired = (biscuitsPerWorker * factoryWorker) * 20;
        int forRemove = biscuitsPerWorker * factoryWorker * 10;
        forRemove -= Math.floor(forRemove * 0.25);
        int biscuitsAmount = allBiscuitsBeforeTired + forRemove;
        double difference;
        double percent;
        if (biscuitsAmount > biscuitsFromOtherFactory) {
            difference = biscuitsAmount - biscuitsFromOtherFactory;
            percent = difference / biscuitsFromOtherFactory * 100;
            System.out.printf("You have produced %d biscuits for the past month.%n", biscuitsAmount);
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        } else {
            difference = biscuitsFromOtherFactory - biscuitsAmount;
            percent = difference / biscuitsFromOtherFactory * 100;
            System.out.printf("You have produced %d biscuits for the past month.%n", biscuitsAmount);
            System.out.printf("You produce %.2f percent less biscuits.", percent);
        }
    }
}
