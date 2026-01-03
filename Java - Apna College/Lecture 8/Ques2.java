import java.util.*;

//Write a function to print the sum of all odd numbers from 1 to n.

public class Ques2 {
    public static void printSum(int n){
        int sum = 1;
        for(int i = 3; i <= n; i++){
            if(i%2 != 0 ){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSum(n);
        sc.close();
    }
}
