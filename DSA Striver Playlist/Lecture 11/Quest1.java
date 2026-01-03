import java.util.*;

// Reverse an array

public class Quest1 {
    public static void reversearr(int i, int n, int arr[]) {
        if(i >= n/2) {
            return;
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[n-1-i];
        arr[n-1-i] = temp;
        reversearr(i+1, n, arr);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        reversearr(0, n, arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
