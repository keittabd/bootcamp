import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of france? ");
        keyboard.next();

        System.out.println("what is 6 multiplied by 7? ");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 0.1? ");
        keyboard.nextDouble();

        System.out.println("Is there anything else you whould like to say ? ");
        keyboard.next();
        
    }
}