import java.util.*;

public class PrintNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Print the sum of First N Natural Numbers
        System.out.println("Enter value of N: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum );
        sc.close();
    }
}
