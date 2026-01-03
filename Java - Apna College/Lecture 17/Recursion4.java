import java.util.*;

// Print factorial of a number n using recursion.

public class Recursion4 {
    public static int returnFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*returnFact(n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        System.out.print("Factorial: " + returnFact(n));  

        sc.close();
    }
}
