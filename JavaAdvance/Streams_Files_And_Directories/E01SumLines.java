package JavaAdvance.Streams_Files_And_Directories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E01SumLines {
    public static void main(String[] args) {
        String filePath = "D:\\Java\\Resources\\input.txt";
        String outputPath = "D:\\Java\\Resources\\output.txt";

        try {
            BufferedReader rd = new BufferedReader(new FileReader(filePath));
            FileWriter writer = new FileWriter(outputPath);
            String line = rd.readLine();
            while (line != null) {

                int sum = 0;
                for (char symbol : line.toCharArray()) {
                    sum += symbol;
                }


                writer.write(String.valueOf(sum));
                writer.write(System.lineSeparator());
                writer.flush();
                line = rd.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
