import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Set a new scanner to read in user input.
        long timeElapsedIterative; // Stores the time elapsed when running the iterative method.
        long timeElapsedRecursive; // Stores the time elapsed when running the recursive method.
        boolean exit = false; // Used for the console menu.
        int iterations; // This stores the degree to which the fibonacci sequence will be evaluated.

        System.out.println("  __ _ _                                _  ");
        System.out.println(" / _(_) |                              (_) ");
        System.out.println("| |_ _| |__   ___  _ __   __ _  ___ ___ _  ");
        System.out.println("|  _| | '_ \\ / _ \\| '_ \\ / _` |/ __/ __| | ");
        System.out.println("| | | | |_) | (_) | | | | (_| | (_| (__| | ");
        System.out.println("|_| |_|_.__/ \\___/|_| |_|\\__,_|\\___\\___|_| ");
        System.out.println("----------------------------------------------");
        System.out.println("[ help ] For a list of commands.");
        while(exit != true){

            System.out.print("$ ");
            String menuSelection = scanner.nextLine();

            switch (menuSelection) {
                case "test":
                    testCases();
                    break;

                case "iteration":
                    iterations = takeUserInputInt(); // Set the number of fibonacci numbers to evaluate to.
                    timeElapsedIterative = Fibonacci.fiboSeriesIte(iterations);
                    showResults(timeElapsedIterative, iterations, "Iterative");
                    break;

                case "recursion":
                    iterations = takeUserInputInt();
                    timeElapsedRecursive = Fibonacci.fiboSeriesRec(iterations);
                    showResults(timeElapsedRecursive, iterations, "Recursive");
                    break;

                case "both":
                    iterations = takeUserInputInt();
                    timeElapsedIterative = Fibonacci.fiboSeriesIte(iterations);
                    showResults(timeElapsedIterative, iterations, "Iterative");
                    timeElapsedRecursive = Fibonacci.fiboSeriesRec(iterations);
                    showResults(timeElapsedRecursive, iterations, "Recursive");
                    break;

                case "help":
                    System.out.println("[ test ] runs both fibonacci methods with inputs 10, 20, 30, 40, 50");
                    System.out.println("[ both ] runs both methods");
                    System.out.println("[ iteration ] runs the iteration method");
                    System.out.println("[ recursion ] runs the recursion method");
                    System.out.println("[ exit ] quits the program");
                    break;

                case "exit":
                    exit = true;
                    break;
            }
        }
    }
}
