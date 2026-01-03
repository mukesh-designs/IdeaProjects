import java.util.*;

public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Print the table of a number input by the user
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.print(n*i + " ");
        }

        sc.close();
    }
}
