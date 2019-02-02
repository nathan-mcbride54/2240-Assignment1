public class Fibonacci {

    public static long fiboSeriesIte(long iterations){
        long startTime = System.nanoTime();
        int n1=0, n2=1, n3, i ;
        System.out.print(n1+" "+n2);
        for(i=2;i<iterations;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long fiboSeriesRec(int iterations){

        return 0;
    }
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
