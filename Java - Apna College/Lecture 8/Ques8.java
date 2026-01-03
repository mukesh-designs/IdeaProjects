import java.util.*;

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raise to the power of another i.e. x^n

public class Ques8 {
    public static int powerTox(int x, int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result*x;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = sc.nextInt();
        System.out.print("Enter a Power to the Number: ");
        int n = sc.nextInt();

        System.out.println(x+"^"+n+": "+powerTox(x, n));
        sc.close();
    }
}
