package pt.pa.adts;
import java.util.Scanner;

public class DecimalToBinary {
    public static String decimal2Binary(int decimal){
        String binary = "";

        do {
            int n = decimal %  2;
            decimal /= 2;

            binary = String.format("%s%s", String.valueOf(n), binary);
        } while(decimal > 0);

        return binary;
    }
}
