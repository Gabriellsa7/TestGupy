package Questions;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        // Obtendo a string de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String word = scanner.nextLine();

        // Invertendo a string
        String reversedString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }

        // Exibindo a string invertida
        System.out.println("String invertida: " + reversedString);
    }
}
