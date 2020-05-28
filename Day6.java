import java.util.*;

public class Day6 {
  public static void main(String[] args) {
        //read input from STDIN
        Scanner scan = new Scanner(System.in);
        
        //tells me how many test cases
        int numberOfCases = scan.nextInt();

        for (int myCase = 0; myCase < numberOfCases; myCase++) {
            String inputString = scan.next();
            for (int currentChar = 0; currentChar < inputString.length(); currentChar++){
                if (currentChar % 2 ==0)
                    System.out.print(inputString.charAt(currentChar));
            }
            System.out.print(" ");
            for (int currentChar = 0; currentChar < inputString.length(); currentChar++){
                if (currentChar % 2 == 1)
                    System.out.print(inputString.charAt(currentChar));
            }       
            System.out.println();     
        }
        scan.close();
    }
}
