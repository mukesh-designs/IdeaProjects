import java.util.*;

//Print x^n using recursion. (Stack height should be logn)

public class Recursion7 {
    public static int returnPow(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            //If n is even
            return returnPow(x, n/2)*returnPow(x, n/2);
        }else{
            //If n is odd
            return returnPow(x, n/2)*returnPow(x, n/2)*x;
        }
    }
    public static void main(String args[]){
        int x = 2, n =5;
        System.out.println(returnPow(x, n));
    }
}
