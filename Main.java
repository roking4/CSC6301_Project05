import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class is the starting point to the program which displays a stack of integers from user input.
 * @author Ronnie King
 */
public class Main {

    /**
     * This method runs the entire program which creates a stack from the input and sorts the stack
     *
     * @param args
     */
    public static void main(String[] args) {

        Stack<Integer> stack;

        stack = createStack();

        stack.sort(Comparator.naturalOrder());

        System.out.println(stack);

    }

    /**
     * This method askes for user input for numbers. The program adds each number to the stack.
     * The stack uses the Collections class built into Java. This method also uses this class to sort the stack.
     *
     * @return integer stack through user input
     */
    public static Stack<Integer> createStack(){

        Scanner inputScanner = new Scanner(System.in);
        int inputNumber;
        Stack<Integer> stack = new Stack<>();

        do {

            System.out.print("Please enter a number: ");

            inputNumber = inputScanner.nextInt();

            stack.push(inputNumber);

        }

        while(enterMoreNumbers());

        return stack;

    }

    /**
     * This method asks if the user would like to add more numbers to the stack
     *
     * @return a boolean to continue adding numbers
     */
    public static boolean enterMoreNumbers(){

        Scanner inputScanner = new Scanner(System.in);
        String enterMoreNumbersInput;

        System.out.print("Enter more numbers? [y/n]");

        enterMoreNumbersInput = inputScanner.nextLine().toUpperCase();

        if(enterMoreNumbersInput.equals("Y")){
            return true;
        }

        return false;

    }

}