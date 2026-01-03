import java.util.*;

//Print x^n using recursion. (Stack height should be n)

public class Recursion6 {
    public static int returnPow(int n, int x){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        return x*returnPow(n-1, x);
    }
    public static void main(String args[]){
        int n = 5, x= 2;
        System.out.println(returnPow(n, x));
    }
}
