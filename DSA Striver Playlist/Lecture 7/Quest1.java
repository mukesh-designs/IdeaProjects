import java.util.*;

//Print count of digits in a number

public class Quest1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digit_count = 0;
        while(n>0) {
            int digits = n%10;
            n = n/10;
            digit_count++;
        }
        System.out.println(digit_count);
        sc.close();
    }
}
