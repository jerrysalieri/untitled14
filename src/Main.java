// Group # 3
import java.util.Scanner;
public class Main {
 /*Adder 2.0
  * Create a program using an array:
  *
  * Ask user what number of elements would he add?
  * Let user input the numbers.
  * Print result like this:
  * 2 + 3 + 5 + 8 = 18
  *
  * Decompose the program into methods.
  *
  */

    /* Main Function
    1. Print program name method
    2. getUserArray
    4. printArraySum
    5. Prompt continue. True: go to #2, otherwise exit
    */

    /* getUserArray
    1. Prompt user how many numbers they need
    2. Let the user enter the numbers
     */

    /* arraySum
    1. Add number to sum
    2. increase index
    3. if index is greater than size, return sum. Otherwise, go back to #1
     */

    // Method to print the program name
    public static void printProgramName() {
        String name = "=== Adder Program ===";
        print(name + "\n");
    }

    // Method to get the user input with a custom prompt
    public static String getUserInput(String prompt) {
        print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim().toLowerCase();
    }

    // Method to get the user input without a custom prompt
    public static String getUserInput() {
       return getUserInput("");
    }

    // Wrapper for printing to terminal
    public static void print(String toPrint) {
        System.out.print(toPrint);
    }

    // Calculate the sum of the array
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Print the result (1 + 2 + 3 = 6)
    public static void printArraySum(int[] array) {
        int sum = arraySum(array);
        for (int i = 0; i < array.length - 1; ++i) {
            print(array[i] + " + ");
        }
        print(array[array.length - 1] + " = " + sum + "\n");
    }

    // Initialize an array and add the user values in
    public static int[] getUserArray() {
        int arrayLength = Integer.parseInt(
                getUserInput("How many number to add: ")
        );
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            numbers[i] = Integer.parseInt(
                    getUserInput("number " + (i + 1) + ": ")
            );
        }
        return numbers;

    }

    public static boolean toContinue() {
        String userInput = getUserInput("Do you want to continue? (Y/N)\n");
        return userInput.equalsIgnoreCase("Y");
    }

    public static void main(String[] args){
        printProgramName();
        do {
            printArraySum(
                getUserArray()
            );
        } while (toContinue());
    }
}


