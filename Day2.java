import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2 {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // double tip = tip_percent * meal_cost/100;

        // (double) casts the int into a double
        double tipRate = (double) tip_percent/100;

        // can also make 100 -> 100.0 to convert to double
        double taxRate = tax_percent/100.0;

        // finds tip and tax amounts
        double tip = tipRate * meal_cost;
        double tax = taxRate * meal_cost;

        // totals meal_cost + tip + tax and rounds it
        int totalCostRounded = (int) Math.round(meal_cost + tip + tax);

        //System.out.printf("%.0f", totalCost); cheats by just trimming off decimals, doesn't round
        System.out.println(totalCostRounded);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
