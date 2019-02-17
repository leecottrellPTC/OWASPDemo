package owasp;

import java.util.Scanner;

/**
 * This program creates a <ul> object to display within a HTML page.
 *
 * @author lee_c
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        String output = "<ul>";
        boolean moreLines = true;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter the sentence to display, type 'done' to exit");
            input = keyboard.nextLine();
            if(input.equalsIgnoreCase("done")){
                moreLines = false;
            }
            else{
                output += "<li>" + input + "</li>";
            }
        } while (moreLines);

        output += "</ul>";
        System.out.println(output);
        
    }

}
