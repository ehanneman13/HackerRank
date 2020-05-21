import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5 {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     *  Prints a times table of the multiplier given by the main method.
     *  @param multiplier This multiplier given by the main method standard input.
     */
    public static void timesTable(int multiplier){
        int product;
        for (int i = 1; i <=10; i++)
        {
            product = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + product);
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        timesTable(n);
    }
}
