import java.util.*;

//Write a function which takes in 2 numbers and returns the greater of those two.

public class Ques3 {
    public static int greaterNumber(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(greaterNumber(a, b));
        sc.close();
    }
}
