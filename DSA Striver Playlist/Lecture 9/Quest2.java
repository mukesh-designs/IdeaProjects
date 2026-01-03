import java.util.*;

// Print linearly from 1 to n.

public class Quest2 {
    public static void print1toN(int i, int n) {
        if(i == n) {
            System.out.print(i);
            return;
        }
        System.out.print(i+" ");
        print1toN(i+1, n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print1toN(1, n);
        sc.close();
    }   
}
