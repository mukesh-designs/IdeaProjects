import java.util.*;

// Armstrong Number = 371 = 3^3+7^3+1^3

public class Quest4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int result = 0;
        while(n>0) {
            int digit = n%10;
            result = result + (digit*digit*digit);
            n=n/10;
        }
        if(original == result){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}
