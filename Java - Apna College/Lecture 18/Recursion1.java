import java.util.*;

// Towe of Hanoi

public class Recursion1 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        String src = "S", helper = "H", dest = "D";
        towerOfHanoi(n, src, helper, dest);
        sc.close();
    }
}
