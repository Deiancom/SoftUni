package ProgrammingBasics.exam_training;

import java.util.Scanner;

public class MultiplyTable_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int x = num /100;       //изчисляваме  цифрата на стотиците понеже ползваме int изрязва сичко след десетичната запетая
        int deseti = num / 10; //използваме за да премахнем  цифрата на единиците
        int y = deseti - x *10;     //калкулираме десетиците
        int z = num - (x *100 + y * 10); // калкулираме единиците
        for (int i = 1; i <= z; i++) { //първи цикъл понеже искат първо да се въртят единиците използваме  "Z"
            for (int j = 1; j <=y ; j++) { //втори цикъл въртим десетиците
                for (int k = 1; k <=x ; k++) { // трети цикъл въртим стотиците
                    int total = i * j * k ; // използваме променлива , която запомня резултата от умножението
                    System.out.printf("%d * %d * %d = %d;%n", i,j,k,total); // принтираме резултата след всяка ротация на цикъла
                }
            }
        }
    }
}
