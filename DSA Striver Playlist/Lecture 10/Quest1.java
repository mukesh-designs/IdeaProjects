import java.util.*;

// Print sum of n natural numbers using recursion.

public class Quest1 {
    public static int sumOfn(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfn(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfn(n));
        sc.close();
    }
}
