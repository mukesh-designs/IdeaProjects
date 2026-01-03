import java.util.*;

//Selection Sort

public class selectionSort {
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

        //Selection Sort Operation - We have to find the smallest element in each iteration and place it on top(Starting).
        // Time Complexity = O(n^2)
        for(int i=0;i<n-1;i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array is: ");
        printArray(arr);
        sc.close();
    }
}
