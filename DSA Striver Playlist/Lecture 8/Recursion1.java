import java.util.*;

//Recursion Demo

public class Recursion1 {
    public static void printNumber(int n) {
        if(n == 3){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        n--;
        printNumber(n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumber(n);
        sc.close();
    }
}
