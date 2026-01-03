import java.util.*;

//Print name n times

public class Quest1 {
    public static void printName(int n, String name) {
        if(n==0){ 
            return;
        }
        System.out.println(name);
        n--;
        printName(n, name);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = "Mukesh";

        printName(n, name);
        sc.close();
    }
}
