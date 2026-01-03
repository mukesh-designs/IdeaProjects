import java.util.*;

// Print linearly from n to 1.

public class Quest3 {
    public static int printNto1(int n){
        if(n == 1){
            return 1;
        }
        System.out.print(n+" ");
        return printNto1(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(printNto1(n)+" ");
        sc.close();

    }
}
