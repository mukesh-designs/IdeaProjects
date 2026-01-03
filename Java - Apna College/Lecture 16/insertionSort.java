import java.util.*;

//Insertion Sort

public class insertionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Insertion Sort Operation
        // Time Complexity = O(n^2)
        for(int i=1;i<n;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //Placement
            arr[j+1] = current;
        }

        System.out.println("Sorted Array is: ");
        printArray(arr);
        sc.close();
    }
}

