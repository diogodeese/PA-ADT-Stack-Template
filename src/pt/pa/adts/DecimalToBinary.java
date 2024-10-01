package pt.pa.adts;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int userInput = scanner.nextInt();

        System.out.println(decimal2Binary(userInput));

        scanner.close();
    }

    public static String decimal2Binary(int decimal){
        String binary = "";

        while(decimal > 0) {
            int n = decimal %  2;
            decimal /= 2;

            binary = String.format("%s%s", String.valueOf(n), binary);
        }

        return binary;
    }
}
