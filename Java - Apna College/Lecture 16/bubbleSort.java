import java.util.*;

//BubbleSort

public class bubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Bubble Sort Operation -- Time Complexity = O(n^2)
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //Print Sorted Array
        System.out.println("Sorted Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
