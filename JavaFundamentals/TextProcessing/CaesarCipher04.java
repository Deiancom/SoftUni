package JavaFundamentals.TextProcessing;

import java.util.Scanner;

public class CaesarCipher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toEncrypt = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < toEncrypt.length(); i++) {
            char beforeEncrypt = toEncrypt.charAt(i);
            beforeEncrypt += 3;
            encryptedText.append(beforeEncrypt);
        }
        System.out.println(encryptedText);
    }
}
