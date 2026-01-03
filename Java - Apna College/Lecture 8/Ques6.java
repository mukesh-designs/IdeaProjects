import java.util.*;

//Write an infinite loop using do while function.

public class Ques6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        do{
            System.out.println("Infinite");
        }while(n>=0);
        sc.close();
    }
}
