import java.util.*;

// Print Fibonacci

public class Quest1 {
    public static int fibonacciSeries(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int last = fibonacciSeries(n-1);
        int slast = fibonacciSeries(n-2);
        return last+slast;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(fibonacciSeries(i)+" ");
        }

        sc.close();
    }
}
