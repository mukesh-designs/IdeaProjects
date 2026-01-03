import java.util.*;

//Write a program to print fibonacci series of n terms where n is input by user: 0 1 1 2 3 5 8 13 21 .....

public class Ques10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNum = 0;
        int SecondNum = 1;
        System.out.print(firstNum+", "+SecondNum);
        for(int i = 3; i <= n; i++){
            int thirdNum = firstNum+SecondNum;
            System.out.print(", "+thirdNum);
            firstNum = SecondNum;
            SecondNum = thirdNum;
            
        }

        sc.close();
    }
}
