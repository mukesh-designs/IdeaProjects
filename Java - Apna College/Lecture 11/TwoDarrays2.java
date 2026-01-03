import java.util.*;

//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

public class TwoDarrays2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter elements: ");
        int numbers[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter a number X: ");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j] == x){
                    System.out.println(i+", "+j);
                    break;
                }
            }
        }
        sc.close();
    }
}
