import java.util.*;

// x^n == Power Exponentiation TC = O(logn)

public class powerExponentiation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = 1;
        while(n>0){
            if(n%2 == 1){
                ans = ans*x;
                n = n-1;
            }else{
                x = x*x;
                n = n/2;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
