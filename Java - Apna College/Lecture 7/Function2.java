import java.util.*;

//Make a Function to add 2 numbers and return the Sum

public class Function2 {
    public static int calculateSum(int a, int b){
        int Sum = a+b;
        return Sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculateSum(a, b));
        sc.close();
    }
}
