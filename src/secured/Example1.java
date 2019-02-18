package secured;

/**
 * This program checks divisibility of two positive integers.grr
 *
 * @author lee_c
 */
import owasp.*;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Example1 {

    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        int remainder = 0;
        String inputString = "";

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        //firstNum = keyboard.nextInt();
        inputString = keyboard.nextLine();
        if (StringUtils.isNumeric(inputString)) {
            firstNum = Integer.parseInt(inputString);
        } else {
            System.out.println("Numbers only, closing program");
            return;
        }

        if (firstNum < 0) {
            firstNum = Math.abs(firstNum);
        }

        System.out.printf("Enter a positive integer less than %d: ", firstNum);
        secondNum = keyboard.nextInt();

        if (secondNum > firstNum) {
            int swap = secondNum;
            secondNum = firstNum;
            firstNum = swap;
        }

        try {
            remainder = firstNum % secondNum;
        } catch (ArithmeticException aex) {
            System.out.println("Cannot divide by 0, closing program");
            return;
        }
        
        
        if (remainder == 0) {
            System.out.printf("%d is divisible by %d\n", firstNum, secondNum);
        } else {
            System.out.printf("The remainder is %d, thus %d is not divisible by %d\n", firstNum, secondNum);
        }

    }

}
