import java.util.*;

//Enter 3 numbers from user and make a function to print their average.

public class Ques1 {
    public static int printAverage(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(printAverage(a, b, c));
        sc.close();
    }
}
