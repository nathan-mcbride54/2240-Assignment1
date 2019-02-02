public class Fibonacci {

    // This is an iterative method that prints the fibonacci sequence and returns the amount of
    // It gets passed an integer of the number of iterations to complete and returns the elapsed time of the method.
    public static long fiboSeriesIte(long iterations){
        long startTime = System.nanoTime(); // Start the clock.
        long n1=0, n2=1, n3, i ;
        System.out.print(n1+" "+n2); // Print the first two numbers.
        for(i=2;i<iterations;++i) // Start i at 2 since first two numbers have been printed already.
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        long endTime = System.nanoTime(); // Stop the clock.
        return endTime - startTime; // Return elapsed time.
    }

    // This method is used to call the recursive method for printing the fibonacci sequence and times the completion of that method.
    // It gets passed an integer of the number of iterations to complete and returns the elapsed time of the method.
    public static long fiboSeriesRec(int iterations){
        long x = iterations -1;
        long startTime = System.nanoTime();  // Start the clock.
        System.out.print("0 ");
        fibonacciRecursionEngine(x, true);
        long endTime = System.nanoTime(); // Stop the clock.
        return endTime - startTime; // Return elapsed time.
    }

    // This is a recursive method that prints the fibonacci sequence.
    // It uses a boolean flag to determine what value should be printed when the method call takes place.
    // It determines the value to be printed by calling itself with x-1 and with x-2 and adding them to get the proper number in the sequence.
    public static long fibonacciRecursionEngine(long x, boolean print){

        if (x==0||x==1) {
            if (print){
                System.out.print(x +" ");
            }
        }
        else {
            if (print) {
                x = fibonacciRecursionEngine(  x -1 , true ) + fibonacciRecursionEngine(x -2 , false);
                System.out.print(x + " ");
            }
            else {
                x = fibonacciRecursionEngine(  x -1 , false ) + fibonacciRecursionEngine(x -2 , false);
            }
        }
        return x;
    }
}
