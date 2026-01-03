import java.util.*;

// Print the fibonacci sequence till nth term using recursion.

public class Recursion5 {
    public static int returnFib(int n){
        if(n <= 1){
            return n;
        }
        return returnFib(n-1)+returnFib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            System.out.print(returnFib(i)+" ");
        }
    }
}
