import java.util.*;

//Take an array as input from the user. Search for a given number x and print the index at which it occurs.

public class Arrays3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a Search number X: ");
        int x = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i] == x){
                System.out.print(i);
                break;
            }
        }

        sc.close();
    }
}
