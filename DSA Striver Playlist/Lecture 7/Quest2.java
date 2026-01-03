import java.util.*;

//Reverse a Number and if a number has trailing zero, then its reverse will not include them. 10400 -> 401 instead of 00401

public class Quest2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = 10*reverse + digit;
            n = n/10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
