public class fibonacci {
    
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
}
