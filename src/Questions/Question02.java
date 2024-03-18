package Questions;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inform a number: ");
        int numero = scan.nextInt();

        int a = 0, b = 1;
        while (a <= numero) {
            if (a == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
                return;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(numero + " não pertence à sequência de Fibonacci.");
    }
}
