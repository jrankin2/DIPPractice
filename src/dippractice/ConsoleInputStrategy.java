
package dippractice;

import java.util.Scanner;

public class ConsoleInputStrategy implements InputStrategy {
    
    @Override
    public String inputMessage(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input something: ");
        String input = keyboard.nextLine();
        return input;
    }
}
