
package owasp;
/**
 * This program checks divisibility of two positive integers. Wee
 * @author lee_c
 */
import java.util.Scanner;

public class Example1 {

    
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        int remainder;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        firstNum = keyboard.nextInt();
        
        System.out.printf("Enter a positive integer less than %d: ", firstNum);
        secondNum = keyboard.nextInt();
        
        remainder = firstNum % secondNum;
        
        if(remainder == 0){
            System.out.printf("%d is divisible by %d\n", firstNum, secondNum);
        }else
        {
            System.out.printf("The remainder is %d, thus %d is not divisible by %d\n", firstNum, secondNum);
        }
        
        
        
        
    }
    
}
