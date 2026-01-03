import java.util.*;

//Print sum of first n natural numbers using recursion

public class Recursion3 {
    public static int returnSum(int n){
        if(n == 1){
            return 1;
        }
        return n + returnSum(n-1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number at which you want sum: ");
        int n = sc.nextInt();

        System.out.println(returnSum(n));

        sc.close();
    }
}
