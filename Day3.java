import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {

    static void weirdCheck (int number) //Bringing in an int given by main, calling it number
    {
        //If number % 2 == 1 (number is odd) or number is greater than 5 and less than 21
        if ((number % 2 == 1) || (number >= 6 && number <= 20))
            System.out.println("Weird");

        //Else number is even and between 2 to 5, or greater than 20
        else
            System.out.println("Not Weird");
 
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //calls weirdCheck function and inputs given int N into the function
        weirdCheck(N);

        scanner.close();
    }
}
