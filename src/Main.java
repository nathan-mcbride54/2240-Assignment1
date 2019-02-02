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
                    timeElapsedIterative = Fibonacci.fiboSeriesIte(iterations); // Record the time elapsed from the method and print the sequence.
                    showResults(timeElapsedIterative, iterations, "Iterative"); // Output results to user.
                    break;

                case "recursion":
                    iterations = takeUserInputInt(); // Set the number of fibonacci numbers to evaluate to.
                    timeElapsedRecursive = Fibonacci.fiboSeriesRec(iterations); // Record the time elapsed from the method and print the sequence.
                    showResults(timeElapsedRecursive, iterations, "Recursive"); // Output results to user.
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

                 default:
                     System.out.println("INVALID ENTRY");
            }
        }
    }

    // This method is called to take an integer from the user to decide how many fibonacci numbers to print.
    private static int takeUserInputInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to evaluate to: $ ");
        int userInt = scanner.nextInt();
        if(userInt > 0){ //To validate that the user entered a positive integer.
            return userInt;
        }
        else{
            System.out.println("ERROR: Invalid Entry");
            takeUserInputInt(); //If they entered a number less than zero, call method again to get positive integer.
        }
        return userInt;
    }

    // This method prints the results of testing the fibonacci methods.
    public static void showResults(long timeElapsed, int iterations, String methodType){
        System.out.println();
        System.out.println("Method type: " + methodType);
        System.out.println("Fibonacci degree: " + iterations);
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsed);
        System.out.println("Elapsed time in milliseconds is: " + timeElapsed/1000000);
        System.out.println("---------------------------------------------");
    }

    // This method was created to automate testing of the program. It compares the results of the two methods after running them one after another.
    public static void testCases(){
        System.out.println("NOW TESTING");
        System.out.println("-----------");
        int[] testCases = {10, 20, 30, 40, 50};
        for(int testCase : testCases){

            long timeElapsedRecursive = Fibonacci.fiboSeriesRec(testCase); // Output the sequence recursively and record the elapsed time.
            System.out.println();
            long timeElapsedIterative = Fibonacci.fiboSeriesIte(testCase); // Output the sequence iteratively and record the elapsed time.
            System.out.println();
            System.out.println("TEST CASE: " + testCase);
            System.out.println("RECURSIVE: " + timeElapsedRecursive + " nanoseconds"); // Print elapsed time for recursion method.
            System.out.println("ITERATIVE: " + timeElapsedIterative + " nanoseconds"); // Print elapsed time for iteration method.
            System.out.println("--------------------------------");
        }
    }
}
