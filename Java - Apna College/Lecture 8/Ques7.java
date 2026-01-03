import java.util.*;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive,negative and zeros entered.

public class Ques7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Zeros = 0;
        int Postives = 0;
        int Negatives = 0;
        while(n-- > 0){
            int i = sc.nextInt();
            if(i>0){
                Postives++;
            }else if(i<0){
                Negatives++;
            }else{
                Zeros++;
            }
        }
        System.out.println("Postives: "+Postives);
        System.out.println("Negatives: "+Negatives);
        System.out.println("Zeros: "+Zeros);
        sc.close();
    }
}
